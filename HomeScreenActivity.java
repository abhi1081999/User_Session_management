package com.example.sessionmanagement;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreenActivity extends AppCompatActivity {


    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        button = findViewById(R.id.out);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                new UserClass(HomeScreenActivity.this)
                        .logOut_user_account();

                Intent i = new Intent(HomeScreenActivity.this,MainActivity.class);

                startActivity(i);

                finish();

            }
        });
    }
}
