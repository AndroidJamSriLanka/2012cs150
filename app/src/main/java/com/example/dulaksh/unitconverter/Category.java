package com.example.dulaksh.unitconverter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import org.unitsofmeasurement.quantity.Area;
import org.unitsofmeasurement.unit.*;
import org.unitsofmeasurement.unit.Unit;

public class Category extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        ImageButton lenconv_button=(ImageButton)findViewById(R.id.lengthconv);
        final Intent ix=new Intent(Category.this,Calculator.class);

        lenconv_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ix.putExtra("type","len");
                startActivity(ix);
            }
        });
        ImageButton weightconv_button=(ImageButton)findViewById(R.id.weightconv);
        weightconv_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ix.putExtra("type","wei");
                startActivity(ix);
            }
        });
        ImageButton volconv_button=(ImageButton)findViewById(R.id.volonv);
        volconv_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ix.putExtra("type","vol");
                startActivity(ix);

            }
        });
        ImageButton speedconv_button=(ImageButton)findViewById(R.id.speedconv);
        speedconv_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ix.putExtra("type","spd");
                startActivity(ix);

            }
        });
        ImageButton moneyconv_button=(ImageButton)findViewById(R.id.moneyconv);
        moneyconv_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ix.putExtra("type","mny");
                startActivity(ix);

            }
        });
        ImageButton tempconv_button=(ImageButton)findViewById(R.id.tempconv);
        tempconv_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ix.putExtra("type","tmp");
                startActivity(ix);
            }
        });
        ImageButton timeconv_button=(ImageButton)findViewById(R.id.timeconv);
        timeconv_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ix.putExtra("type","tm");
                startActivity(ix);

            }
        });
        ImageButton areaconv_button=(ImageButton)findViewById(R.id.areaconv);
        areaconv_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ix.putExtra("type","ar");
                startActivity(ix);

            }
        });
        ImageButton powerconv_button=(ImageButton)findViewById(R.id.powerconv);
        powerconv_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ix.putExtra("type","po");
                startActivity(ix);
            }
        });

    }



}
