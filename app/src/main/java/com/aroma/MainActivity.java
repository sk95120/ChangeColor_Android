package com.aroma;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView red,blue,green;
    View colorBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        red = (TextView) findViewById(R.id.red);
        green = (TextView) findViewById(R.id.green);
        blue = (TextView) findViewById(R.id.blue);
        colorBar = (View) findViewById(R.id.colorBar);
    }
    public void changeColor(View v){
        Random x = new Random();

        int redNum = x.nextInt(256);
        red.setText("红色："+redNum);
        red.setTextColor(Color.rgb(redNum,0,0));

        int greenNum = x.nextInt(256);
        green.setText("绿色："+greenNum);
        green.setTextColor(Color.rgb(0,greenNum,0));

        int blueNum = x.nextInt(256);
        blue.setText("蓝色："+blueNum);
        blue.setTextColor(Color.rgb(0,0,blueNum));
        colorBar.setBackgroundColor(Color.rgb(redNum,greenNum,blueNum));
    }
}
