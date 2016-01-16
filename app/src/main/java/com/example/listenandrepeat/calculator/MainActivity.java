package com.example.listenandrepeat.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    // 10 , 11 , 12 , 13 , 14 , 15, 16 , 17 , 18
    Button btn;

    TextView textView;
    static int a , b;
    static float c , d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = (TextView)findViewById(R.id.cal_text);
        btn = (Button)findViewById(R.id.button0);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("0");

            }
        });
        btn = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("1");
            }
        });
        btn = (Button)findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("2");
            }
        });
        btn = (Button)findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("3");
            }
        });
        btn = (Button)findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("4");
            }
        });
        btn = (Button)findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("5");
            }
        });
        btn = (Button)findViewById(R.id.button6);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("6");
            }
        });
        btn = (Button)findViewById(R.id.button7);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("7");
            }
        });
        btn = (Button)findViewById(R.id.button8);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("8");
            }
        });
        btn = (Button)findViewById(R.id.button9);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("9");
            }
        });
        btn = (Button)findViewById(R.id.button_clear);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("0");
            }
        });
        btn = (Button)findViewById(R.id.button_div);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("/");
            }
        });
        btn = (Button)findViewById(R.id.button_float);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText(".");
            }
        });
        btn = (Button)findViewById(R.id.button_minus);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("-");
            }
        });
        btn = (Button)findViewById(R.id.button_mod);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("%");
            }
        });
        btn = (Button)findViewById(R.id.button_mult);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("X");
            }
        });
        btn = (Button)findViewById(R.id.button_negative);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("-");
            }
        });
        btn = (Button)findViewById(R.id.button_plus);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("+");
            }
        });
        btn = (Button)findViewById(R.id.button_result);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("=");
            }
        });


    }



}
