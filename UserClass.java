package com.example.sessionmanagement;

import android.content.Context;
import android.content.SharedPreferences;

public class UserClass {
    private String email;
    private String password;
    Context context;
    SharedPreferences sharedPreferences;

    public UserClass(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences("user_details",Context.MODE_PRIVATE);


    }

    public String getEmail() {
        email = sharedPreferences.getString("emailid1","");
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        sharedPreferences.edit().putString("emailid1",email).commit();
    }

    public String getPassword() {
        password = sharedPreferences.getString("pass1","");
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        sharedPreferences.edit().putString("pass1",password).commit();
    }
    public void logOut_user_account(){

        sharedPreferences.edit().clear().commit();

    }

}
