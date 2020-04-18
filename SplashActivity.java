package com.example.sessionmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        getSupportActionBar().hide();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {


                if(new UserClass(SplashActivity.this).getEmail()=="" || new UserClass(SplashActivity.this).getPassword()=="") {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    finish();

                }

                else {
                    startActivity(new Intent(SplashActivity.this, HomeScreenActivity.class));
                finish();
                }

            }
        },2000);


    }
}
