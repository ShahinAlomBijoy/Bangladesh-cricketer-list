package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView CricketergridView;
    CustomGridAdapter adapter;
    List<Cricketer> cricketerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CricketergridView = findViewById(R.id.idGridView);
        cricketerList = new ArrayList<>();
        setCricketerData();
        adapter = new CustomGridAdapter(this, cricketerList);
        CricketergridView.setAdapter(adapter);
    }

    private void setCricketerData() {
        Cricketer mas = new Cricketer(R.drawable.mus, "Mosficur Rohim");
        Cricketer shakib = new Cricketer(R.drawable.shakib, "Shakin al hasan");
        Cricketer Rubel = new Cricketer(R.drawable.ru, "Rubel");
        Cricketer tammim = new Cricketer(R.drawable.tami, "Tammim ekbal");
        Cricketer Liton = new Cricketer(R.drawable.lit, "Liton Das");
        Cricketer bijoy = new Cricketer(R.drawable.bi, "Anamul hoq Bijoy");
        Cricketer mushtafizol = new Cricketer(R.drawable.mush, "Mushtafizal");
        //Cricketer shahin=new Cricketer(R.drawable.shahin,"Shahin Alom Bijoy");
        //Cricketer naim=new Cricketer(R.drawable.sm,"S M Zannatul Naim");
        cricketerList.add(mas);
        cricketerList.add(shakib);
        cricketerList.add(Rubel);
        cricketerList.add(tammim);
        cricketerList.add(Liton);
        cricketerList.add(bijoy);
        cricketerList.add(mushtafizol);
        cricketerList.add(mushtafizol);
       /* cricketerList.add(shahin);
        cricketerList.add(naim);
        cricketerList.add(shahin);
        cricketerList.add(naim);
        cricketerList.add(shahin);
        cricketerList.add(naim);
        cricketerList.add(shahin);
        cricketerList.add(naim);
        cricketerList.add(shahin);
        cricketerList.add(naim);
        cricketerList.add(shahin);
        cricketerList.add(naim);
        cricketerList.add(shahin);
        cricketerList.add(naim);
        cricketerList.add(shahin);
        cricketerList.add(naim);
        cricketerList.add(shahin);
        cricketerList.add(naim);
        cricketerList.add(shahin);
        cricketerList.add(naim);
        cricketerList.add(shahin);
        cricketerList.add(naim);
        cricketerList.add(shahin);
        cricketerList.add(naim);
        cricketerList.add(shahin);
        cricketerList.add(naim);
*/





    }
}