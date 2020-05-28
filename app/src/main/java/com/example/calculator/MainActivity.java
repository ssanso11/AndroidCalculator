package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.*;
import net.objecthunter.exp4j.*;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    static String currentString = "";

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
        final Button openPar = findViewById(R.id.open_par);
        final Button clear = findViewById(R.id.clear);
        final Button equals = findViewById(R.id.equals);
        final Button decimal = findViewById(R.id.decimal);
        final Button closePar = findViewById(R.id.close_par);
        final Button deleteOne = findViewById(R.id.delete_one);

        //listens for click of button 0
        no0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set equation text equal to equation text + 0
                //.setText() is for setting labels,
                equation.append("0");
                currentString +="0";
            }
        });
        //listens for click of button 1
        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.append("1");
                currentString +="1";

            }
        });
        //listens for click of button 2
        no2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.append("2");
                currentString +="2";


            }
        });
        //listens for click of button 3
        no3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.append("3");

                currentString +="3";


            }
        });
        //listens for click of button 4
        no4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.append("4");

                currentString +="4";

            }
        });
        //listens for click of button 5
        no5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.append("5");
                currentString +="5";

            }
        });
        //listens for click of button 6
        no6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.append("6");
                currentString +="6";

            }
        });
        //listens for click of button 7
        no7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.append("7");
                currentString +="7";

            }
        });
        //listens for click of button 8
        no8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.append("8");
                currentString +="8";

            }
        });
        //listens for click of button 9
        no9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.append("9");
                currentString +="9";

            }
        });
        //listens for click of add button
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentString+="+";
                equation.append("+");
            }
        });
        //listens for click of subtract button
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                equation.append("-");
                currentString +="-";
            }
        });
        //listens for click of multiply button
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.append("x");
                currentString +="*";

            }
        });
        //listens for click of divide button
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.append("/");
                currentString +="/";

            }
        });
        //listens for click of clear button
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText("");
                result.setText("");
                currentString ="";

            }
        });
        //listens for click of open parenthesis button
        openPar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.append("(");
                currentString +="(";
            }
        });
        //listens for click of decimal button
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.append(".");
                currentString +=".";
            }
        });
        //listens for click of close parenthesis button
        closePar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.append(")");
                currentString +=")";
            }
        });
        //listens for click of delete one button
        deleteOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equation.length() >= 1)
                {
                    equation.setText(equation.getText().toString().substring(0, equation.length()-1) );
                    currentString =currentString.substring(0, currentString.length()-1);
                }
            }
        });
        //listens for click of equal button
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentString.length() != 0)
                {

                    //handle divide by zero and syntax errors
                    try {
                        //evaluate gets the result of the expression
                        //create a new expression with library openhunter.net, was found by bryson's dad
                        //really cool library, parses string expressions using shunting yard algorithm
                        Expression e = new ExpressionBuilder(currentString).build();
                        ValidationResult syntaxCheck = e.validate();
                        if(syntaxCheck.isValid())
                        {
                            double res = e.evaluate();
                            result.setText("" + res);
                        }
                        else
                        {
                            result.setText("Invalid Syntax");
                        }
                    } catch(IllegalArgumentException pErr) {
                        result.setText("Invalid Syntax");
                    } catch (EmptyStackException err) {
                        result.setText("Invalid syntax");
                    } catch (Exception ArithmeticException) {
                        result.setText("Divide by zero!");
                    }  finally {

                    }

                }


            }
        });


    }
}
