package com.example.cylim.eatalot;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void goToHomeScreen2 (View view){
        Intent intent = new Intent (this, HomeScreen.class);
        startActivity(intent);
    }
}
