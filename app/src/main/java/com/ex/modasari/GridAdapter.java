package com.ex.modasari;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

    Context context;
    String[] name,image_ochiqlama;
    int[] image;

    LayoutInflater inflater;

    public GridAdapter(Context context, String[] name, String[] image_ochiqlama, int[] image) {
        this.context = context;
        this.name = name;
        this.image_ochiqlama = image_ochiqlama;
        this.image = image;

    }



    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

       if (inflater == null)
           inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

       if (convertView == null){

           convertView = inflater.inflate(R.layout.grid_item,null);

       }

        ImageView imageView = convertView.findViewById(R.id.Grid_imageView);
        TextView textView_nomi = convertView.findViewById(R.id.nomi);
        TextView textView_ochilama = convertView.findViewById(R.id.rasm_ochiqlama);

        imageView.setImageResource(image[position]);
        textView_nomi.setText(name[position]);
        textView_ochilama.setText(image_ochiqlama[position]);

        return convertView;
    }
}
