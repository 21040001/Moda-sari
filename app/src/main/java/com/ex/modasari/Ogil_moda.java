package com.ex.modasari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.ex.modasari.databinding.ActivityErkekModaBinding;
import com.ex.modasari.databinding.ActivityOgilModaBinding;

public class Ogil_moda extends AppCompatActivity {
    ActivityOgilModaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityOgilModaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String[] univernameName={"Anadolu","Anadolu-2","Bartin","Anadolu","Anadolu-2","Bartin"};
        String[] image_ochiqlama={"Anadolu univertisesi","Anadolu-2 universitesi","Bartin universitesi","Anadolu univertisesi","Anadolu-2 universitesi","Bartin universitesi"};
        int[] images = {R.drawable.ayol,R.drawable.erkek,R.drawable.erkek,R.drawable.qiz,R.drawable.account,R.drawable.ayol};

        GridAdapter gridadapter= new GridAdapter(Ogil_moda.this,univernameName,image_ochiqlama,images);
        binding.gridviewList.setAdapter(gridadapter);



    }
    public void buyurtma(MenuItem v){
        Intent i =new Intent(Ogil_moda.this,Buyurtmalarim.class);
        startActivity(i);
    }
    public void ona_sahifa(MenuItem v){
        Intent i =new Intent(Ogil_moda.this,Onasahifa.class);
        startActivity(i);
    }
}