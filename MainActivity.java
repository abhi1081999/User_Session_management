package com.example.sessionmanagement;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    Button b;
    EditText emailid , password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.login_Button);
        emailid = findViewById(R.id.email);
        password = findViewById(R.id.passwd);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = emailid.getText().toString();
                String pass = password.getText().toString();

                if(email.equals("")|| pass.equals("")){
                    Toast.makeText(MainActivity.this, "Fill all Details", Toast.LENGTH_SHORT).show();

                }
                else{

                    UserClass userClass = new UserClass(MainActivity.this);
                    userClass.setEmail(email);
                    userClass.setPassword(pass);



                    startActivity(new Intent(MainActivity.this,HomeScreenActivity.class));
                    finish();


                }







            }
        });





    }
}
