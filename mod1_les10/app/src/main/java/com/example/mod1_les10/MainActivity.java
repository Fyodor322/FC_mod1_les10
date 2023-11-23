package com.example.mod1_les10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Начинаем");

        double priceComputer = 33_500;
        double account = 5000;
        double scholardhip = 3800;
        double procent = 7/12.0;
        double rezult = account + scholardhip;

        TextView textView = findViewById(R.id.countMonth);
        textView.setText(String.valueOf(countMonth(priceComputer, scholardhip, procent, account)));
    }

    int countMonth(double price, double scholardhip, double procent, double account){
        int countMonth = 1;
        double rezult = account + scholardhip;
        while (price > rezult){
            rezult = rezult + rezult * procent / 100 + rezult + scholardhip;
            countMonth++;
            System.out.println(countMonth + "месяц: " + rezult);
        }
        return countMonth;
    }

}