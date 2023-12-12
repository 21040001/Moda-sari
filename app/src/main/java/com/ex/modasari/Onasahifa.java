package com.ex.modasari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class Onasahifa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onasahifa);


        ImageSlider imageSlider=findViewById(R.id.imageslide);
        ArrayList<SlideModel> slidemodel=new ArrayList<>();
        slidemodel.add(new SlideModel(R.drawable.ayol,ScaleTypes.FIT));
        slidemodel.add(new SlideModel(R.drawable.erkek,ScaleTypes.FIT));
        slidemodel.add(new SlideModel(R.drawable.ogil,ScaleTypes.FIT));
        slidemodel.add(new SlideModel(R.drawable.qiz,ScaleTypes.FIT));
        imageSlider.setImageList(slidemodel, ScaleTypes.FIT);

    }
    public void qiz_moda(View v){

        Intent i =new Intent(Onasahifa.this,Qiz_moda.class);
        startActivity(i);
    }
    public void ogil_moda(View v){
        Intent i =new Intent(Onasahifa.this,Ogil_moda.class);
        startActivity(i);
    }
    public void erkek_moda(View v){
        Intent i =new Intent(Onasahifa.this,Erkek_moda.class);
        startActivity(i);
    }
    public void ayol_moda(View v){
        Intent i =new Intent(Onasahifa.this,Ayol_moda.class);
        startActivity(i);
    }
   public void buyurtma(MenuItem v){
        Intent i =new Intent(Onasahifa.this,Buyurtmalarim.class);
        startActivity(i);
    }
   public void ona_sahifa(MenuItem v){
       Intent i =new Intent(Onasahifa.this,Onasahifa.class);
      startActivity(i);
   }
}