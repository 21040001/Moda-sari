package com.ex.modasari;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.ex.modasari.databinding.ActivityAyolModaBinding;
import com.ex.modasari.databinding.ActivityOgilModaBinding;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class Ayol_moda extends AppCompatActivity {
    ActivityAyolModaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAyolModaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String[] univernameName={"Anadolu","Anadolu-2","Bartin","Anadolu","Anadolu-2","Bartin"};
        String[] image_ochiqlama={"Anadolu univertisesi","Anadolu-2 universitesi","Bartin universitesi","Anadolu univertisesi","Anadolu-2 universitesi","Bartin universitesi"};
        int[] images = {R.drawable.ayol,R.drawable.erkek,R.drawable.erkek,R.drawable.qiz,R.drawable.account,R.drawable.ayol};

        GridAdapter gridadapter= new GridAdapter(Ayol_moda.this,univernameName,image_ochiqlama,images);
        binding.gridviewList.setAdapter(gridadapter);








    }
    public void buyurtma(MenuItem v){
        Intent i =new Intent(Ayol_moda.this,Buyurtmalarim.class);
        startActivity(i);
    }
    public void ona_sahifa(MenuItem v){
        Intent i =new Intent(Ayol_moda.this,Onasahifa.class);
        startActivity(i);
    }
}