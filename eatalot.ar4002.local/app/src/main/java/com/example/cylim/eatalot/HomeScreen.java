package com.example.cylim.eatalot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void goToRestaurant (View view){
        Intent intent = new Intent(this, Restaurant.class);
        startActivity(intent);
    }

}
