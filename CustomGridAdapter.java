package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class CustomGridAdapter extends BaseAdapter {
    Context context;
    List<Cricketer> cricketerList= new ArrayList<>();

    public CustomGridAdapter(Context context, List<Cricketer> cricketerList) {
        this.context = context;
        this.cricketerList = cricketerList;
    }

    @Override
    public int getCount() {
        return cricketerList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return cricketerList.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customView=inflater.inflate(R.layout.item_layout,null);
        ImageView imageView =customView.findViewById(R.id.idImage);
        TextView textView=customView.findViewById(R.id.idTextView);
        imageView.setImageResource(cricketerList.get(position).getImage());
        textView.setText(cricketerList.get(position).getName());

        return customView;
    }
}
