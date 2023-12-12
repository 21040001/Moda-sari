package com.ex.modasari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.ex.modasari.databinding.ActivityOgilModaBinding;
import com.ex.modasari.databinding.ActivityQizModaBinding;

public class Qiz_moda extends AppCompatActivity {
    ActivityQizModaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityQizModaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String[] univernameName={"Anadolu","Anadolu-2","Bartin","Anadolu","Anadolu-2","Bartin"};
        String[] image_ochiqlama={"Anadolu univertisesi","Anadolu-2 universitesi","Bartin universitesi","Anadolu univertisesi","Anadolu-2 universitesi","Bartin universitesi"};
        int[] images = {R.drawable.ayol,R.drawable.erkek,R.drawable.erkek,R.drawable.qiz,R.drawable.account,R.drawable.ayol};

        GridAdapter gridadapter= new GridAdapter(Qiz_moda.this,univernameName,image_ochiqlama,images);
        binding.gridviewList.setAdapter(gridadapter);



    }
    public void buyurtma(MenuItem v){
        Intent i =new Intent(Qiz_moda.this,Buyurtmalarim.class);
        startActivity(i);
    }
    public void ona_sahifa(MenuItem v){
        Intent i =new Intent(Qiz_moda.this,Onasahifa.class);
        startActivity(i);
    }}