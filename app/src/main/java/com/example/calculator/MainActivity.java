package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bc,be,bd,bmu,bmi,bp;
    TextView text1, text3;
    int a, b;
    String action;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = findViewById(R.id.zero);
        b1 = findViewById(R.id.one);
        b2 = findViewById(R.id.two);
        b3 = findViewById(R.id.three);
        b4 = findViewById(R.id.four);
        b5 = findViewById(R.id.five);
        b6 = findViewById(R.id.six);
        b7 = findViewById(R.id.seven);
        b8 = findViewById(R.id.eight);
        b9 = findViewById(R.id.nine);
        bc = findViewById(R.id.clear);
        be = findViewById(R.id.equals);
        bd = findViewById(R.id.div);
        bmu = findViewById(R.id.multi);
        bmi = findViewById(R.id.minus);
        bp = findViewById(R.id.plus);
        text1 = findViewById(R.id.text1);
        text3 = findViewById(R.id.text3);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.append("0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.append("1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.append("2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.append("3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.append("4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.append("5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.append("6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.append("7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.append("8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.append("9");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText("");
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = text1.getText().toString();
                if (s != "") {
                    action = "d";
                    a = Integer.parseInt(s);
                    text3.setText(s + "/");
                    text1.setText("");
                }
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = text1.getText().toString();
                if(s != ""){
                    action = "p";
                    a = Integer.parseInt(s);
                    text3.setText(s + "+");
                    text1.setText("");
                }
            }
        });
        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = text1.getText().toString();
                if(s != ""){
                    action = "mi";
                    a = Integer.parseInt(s);
                    text3.setText(s + "-");
                    text1.setText("");
                }
            }
        });
        bmu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = text1.getText().toString();
                if(s != ""){
                    action = "mu";
                    a = Integer.parseInt(s);
                    text3.setText(s + "*");
                    text1.setText("");
                }
            }
        });
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = text1.getText().toString();
                b = Integer.parseInt(s);
                String res = "";
                switch (action) {
                    case "p": {
                        res = a + b + "";
                        break;
                    }
                    case "m": {
                        res = a - b+ "";
                        break;
                    }
                    case "mu": {
                        res = a * b + "";
                        break;
                    }
                    case "d": {
                        res = (a / (double)b) + "";
                        break;
                    }
                }
                text3.append(s + " = " + res);
                text1.setText("");
            }
        });

    }



}
