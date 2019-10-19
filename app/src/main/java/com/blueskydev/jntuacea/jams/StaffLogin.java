package com.blueskydev.jntuacea.jams;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StaffLogin extends AppCompatActivity {

    Button StaffLoginButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar

        setContentView(R.layout.activity_staff_login);

        StaffLoginButton2 = findViewById(R.id.StaffLoginButton2);
        StaffLoginButton2.setVisibility(View.VISIBLE);
        StaffLoginButton2.setBackgroundColor(Color.TRANSPARENT);

        StaffLoginButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(StaffLogin.this,StaffMainScreen.class);
                startActivity(intent);

            }
        });

    }
}
