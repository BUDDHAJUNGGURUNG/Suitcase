package com.example.suitcase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.suitcase.databinding.ActivityResetPasswordBinding;

public class ResetPassword extends AppCompatActivity {

    ActivityResetPasswordBinding binding;

    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityResetPasswordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        databaseHelper=new DatabaseHelper(this);

        Intent intent=getIntent();
        binding.email.setText(intent.getStringExtra("email"));
        binding.resetConfirmPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = binding.newPassword.getText().toString().trim();
                String rePassword = binding.rePassword.getText().toString().trim();

                if (password.equals(rePassword)){
                    Boolean checkPasswordUpdate = databaseHelper.updatePassword(password);

                    if (checkPasswordUpdate==true){
                        Intent updatePasswordIntent= new Intent(getApplicationContext(), Login_Page.class);
                        startActivity(updatePasswordIntent);
                        Toast.makeText(ResetPassword.this, "Password Updated", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(ResetPassword.this, "Password not Updated", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}