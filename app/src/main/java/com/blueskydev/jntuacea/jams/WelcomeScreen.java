package com.blueskydev.jntuacea.jams;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeScreen extends AppCompatActivity {



    Button letsGetStartedButton ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar

        setContentView(R.layout.activity_welcome_screen);

        letsGetStartedButton = findViewById(R.id.letsGetStartedButton);
        letsGetStartedButton.setVisibility(View.VISIBLE);
        letsGetStartedButton.setBackgroundColor(Color.TRANSPARENT);

        letsGetStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WelcomeScreen.this,LoginScreen.class);
                startActivity(intent);

            }
        });



    }
}
