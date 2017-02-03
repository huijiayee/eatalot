package com.example.cylim.eatalot;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
    }

    public void goToWeb (View view){
        String url ="http://www.culinarypleasure.com/reservation.php";
        Intent intent = new Intent();
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void goToWeb (View view){
        String url ="https://www.google.com.my/maps/place/Culinary+Pleasure+International+Restaurant/@2.9269271,101.6488153,17z/data=!3m1!4b1!4m5!3m4!1s0x31cdb6f9547dd943:0x72c8560b30a8d831!8m2!3d2.9269217!4d101.651004?hl=en";
        Intent intent = new Intent();
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

}
