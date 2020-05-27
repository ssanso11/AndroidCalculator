package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.*;

public class MainActivity extends AppCompatActivity {
    static double res = 0.0;
    static String currentString = "";
    static double currentNumber = 0.0;
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
        final Button no1 = findViewById(R.id.no1);
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
        //listens for click of button 0
        no0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set equation text equal to equation text + 0
                equation.setText(equation.getText() + "0");
                currentString +="0";
                currentNumber += (double) Integer.parseInt(currentString);
            }
        });

        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "1");
                currentString +="1";
                currentNumber += (double) Integer.parseInt(currentString);

            }
        });
        no2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "2");
                currentString +="2";
                currentNumber += (double) Integer.parseInt(currentString);


            }
        });
        no3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "3");
                currentString +="3";
                currentNumber += (double) Integer.parseInt(currentString);


            }
        });
        no4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "4");
                currentString +="4";
                currentNumber += (double) Integer.parseInt(currentString);

            }
        });
        no5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "5");
                currentString +="5";
                currentNumber += (double) Integer.parseInt(currentString);

            }
        });
        no6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "6");
                currentString +="6";
                currentNumber += (double) Integer.parseInt(currentString);

            }
        });
        no7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "7");
                currentString +="7";
                currentNumber += (double) Integer.parseInt(currentString);

            }
        });
        no8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "8");
                currentString +="8";
                currentNumber += (double) Integer.parseInt(currentString);

            }
        });
        no9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + "9");
                currentString +="9";
                currentNumber += (double) Integer.parseInt(currentString);

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1234+2342
                res += currentNumber;
                equation.setText(equation.getText() + " + ");
                currentNumber = 0.0;
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res -= currentNumber;
                equation.setText(equation.getText() + " - ");
                currentNumber = 0.0;
                currentString ="";
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res *= currentNumber;
                equation.setText(equation.getText() + " x ");
                currentNumber = 0.0;
                currentString ="";

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res /= currentNumber;
                equation.setText(equation.getText() + " / ");
                currentNumber = 0.0;
                currentString ="";

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText("");
                result.setText("");
                currentNumber = 0.0;
                currentString ="";

            }
        });
        modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + " % ");
            }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + ".");
            }
        });
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(equation.getText() + " - ");
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res += currentNumber;
                result.setText("" + res);
                currentNumber = 0.0;
                currentString ="";

            }
        });


    }
}
