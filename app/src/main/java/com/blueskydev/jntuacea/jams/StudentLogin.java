package com.blueskydev.jntuacea.jams;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StudentLogin extends AppCompatActivity {

    Button StudentLoginButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar

        setContentView(R.layout.activity_student_login);

        StudentLoginButton2 = findViewById(R.id.StudentLoginbutton2);
        StudentLoginButton2.setVisibility(View.VISIBLE);
        StudentLoginButton2.setBackgroundColor(Color.TRANSPARENT);

        StudentLoginButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(StudentLogin.this,StudentMainScreen.class);
                startActivity(intent);

            }
        });


    }
}
