package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        final TextView equation = findViewById(R.id.equation);
        final TextView result = findViewById(R.id.result);
        final Button no0 = findViewById(R.id.no0);
        no0.setOnClickListener(this);
        final Button no1 = findViewById(R.id.no1);
        no1.setOnClickListener(this);
        final Button no2 = findViewById(R.id.no2);
        final Button no3 = findViewById(R.id.no3);
        final Button no4 = findViewById(R.id.no4);
        final Button no5 = findViewById(R.id.no5);
        final Button no6 = findViewById(R.id.no6);
        final Button no7 = findViewById(R.id.no7);
        final Button no8 = findViewById(R.id.no8);
        final Button no9 = findViewById(R.id.no9);
        final Button add = findViewById(R.id.add);
        final Button subtract = findViewById(R.id.subtract);
        final Button divide = findViewById(R.id.divide);
        final Button multiply = findViewById(R.id.multiply);
        final Button modulus = findViewById(R.id.modulus);
        final Button clear = findViewById(R.id.clear);
        final Button history = findViewById(R.id.history);
        final Button equals = findViewById(R.id.equals);
        final Button decimal = findViewById(R.id.decimal);
        final Button sign = findViewById(R.id.change_sign);
        no0.setOnClickListener(this);
        no1.setOnClickListener(this);
        no2.setOnClickListener(this);
        no3.setOnClickListener(this);
        no4.setOnClickListener(this);
        no5.setOnClickListener(this);
        no6.setOnClickListener(this);
        no7.setOnClickListener(this);
        no8.setOnClickListener(this);
        no9.setOnClickListener(this);
        add.setOnClickListener(this);
        subtract.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        clear.setOnClickListener(this);
        modulus.setOnClickListener(this);
        decimal.setOnClickListener(this);
        sign.setOnClickListener(this);
        equals.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        final int id = v.getId();
        Log.d("TEST", Integer.toString(id));
        switch(id){
            case R.id.no0:
                equation.setText("0");
                Log.d("ASDASD", "0");
            case R.id.no1:
                Log.d("ASDASD", "1");
            case R.id.no2:
                Log.d("ASDASD", "2");
            case R.id.no3:
                Log.d("ASDASD", "3");
            case R.id.no4:
                Log.d("ASDASD", "4");
            case R.id.no5:
                Log.d("ASDASD", "5");
            case R.id.no6:
                Log.d("ASDASD", "6");
            case R.id.no7:
                Log.d("ASDASD", "7");
            case R.id.no8:
                Log.d("ASDASD", "8");
            case R.id.no9:
                Log.d("ASDASD", "9");
            case R.id.add:
                Log.d("ASDASD", "+");
            case R.id.subtract:
                Log.d("ASDASD", "-");
            case R.id.multiply:
                Log.d("ASDASD", "x");
            case R.id.divide:
                Log.d("ASDASD", "divide");
            case R.id.equals:
                Log.d("ASDASD", "=");
        }
    }
}
