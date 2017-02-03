package com.example.cylim.eatalot;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DayTrip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_trip);
    }

    public void goToHomeScreen3 (View view){
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }

    public void goToStore1 (View view){
        String url ="https://www.facebook.com/SanaaRestaurant/";
        Intent intent = new Intent();
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }


    public void goToStore2 (View view){
        String url ="https://www.facebook.com/monjocoffee/";
        Intent intent = new Intent();
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void goToStore3 (View view){
        String url ="hhttp://www.cyberjayacity.com/baskin-robbins-is-opening-soon-in-dpulze-shopping-centre/";
        Intent intent = new Intent();
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
