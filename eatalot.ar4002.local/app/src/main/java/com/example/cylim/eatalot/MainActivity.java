package com.example.cylim.eatalot;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }

    public void goToSignUp (View view){
        Intent intent = new Intent (this, SignUp.class);
        startActivity(intent);
    }

    public void goToHomeScreen (View view){
        Intent intent = new Intent (this, HomeScreen.class);
        startActivity(intent);
    }

    public void goToCard (View view){
        Intent intent = new Intent(this, testActivity.class);
        startActivity(intent);
    }
}
