package com.ex.modasari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class Buyurtmalarim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyurtmalarim);
    }




   public void buyurtma(MenuItem v){
        Intent i =new Intent(Buyurtmalarim.this,Buyurtmalarim.class);
        startActivity(i);
    }
    public void ona_sahifa(MenuItem v){
        Intent i =new Intent(Buyurtmalarim.this,Onasahifa.class);
        startActivity(i);
    }
}