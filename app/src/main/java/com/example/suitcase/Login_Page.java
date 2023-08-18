package com.example.suitcase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.suitcase.databinding.ActivityLoginPageBinding;

public class Login_Page extends AppCompatActivity {

    ActivityLoginPageBinding binding;

    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLoginPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        databaseHelper=new DatabaseHelper(this);

        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        binding.txtforgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), ForgotPassword_Page.class);
                startActivity(intent);

            }
        });
        binding.txtSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Signup_Page.class);
                startActivity(intent);

            }
        });
    }
}