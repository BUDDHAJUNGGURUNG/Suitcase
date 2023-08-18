package com.example.suitcase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.suitcase.databinding.ActivitySignupPageBinding;

public class Signup_Page extends AppCompatActivity {

    ActivitySignupPageBinding binding;

    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySignupPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        databaseHelper=new DatabaseHelper(this);


        binding.signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Signup Method
            }
        });
        //Just click to move login page

        binding.txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Login_Page.class);
                startActivity(intent);
            }
        });

    }
}