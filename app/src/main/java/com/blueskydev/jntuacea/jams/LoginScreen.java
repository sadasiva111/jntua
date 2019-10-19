package com.blueskydev.jntuacea.jams;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginScreen extends AppCompatActivity {

    Button StaffLoginButton,StudentLoginButton;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar

        setContentView(R.layout.activity_login_screen);

        StaffLoginButton = findViewById(R.id.StaffLoginButton);
        StaffLoginButton.setVisibility(View.VISIBLE);
        StaffLoginButton.setBackgroundColor(Color.TRANSPARENT);

        StaffLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginScreen.this,StaffLogin.class);
                startActivity(intent);

            }
        });

        StudentLoginButton = findViewById(R.id.StudentLoginButton);
        StudentLoginButton.setVisibility(View.VISIBLE);
        StudentLoginButton.setBackgroundColor(Color.TRANSPARENT);

        StudentLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginScreen.this,StudentLogin.class);
                startActivity(intent);

            }
        });



    }
}
