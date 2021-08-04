package com.example.jrmpkalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText in1, in2;
    Button tambah, kali, bagi, kurang;
    TextView out;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        in1=(EditText) findViewById(R.id.et_1);
        in2=(EditText) findViewById(R.id.et_2);
        tambah=(Button) findViewById(R.id.btn_tambah);
        kali=(Button) findViewById(R.id.btn_kali);
        bagi=(Button) findViewById(R.id.btn_bagi);
        kurang=(Button) findViewById(R.id.btn_kurang);
        out=(TextView) findViewById(R.id.tv_hasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double b1, b2, hsl;
                b1=Double.valueOf(in1.getText().toString().trim());
                b2=Double.valueOf(in2.getText().toString().trim());
                hsl=b1+b2;
                String hasil=String.valueOf(hsl);
                        out.setText(hasil);
            }
        });

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double b1, b2, hsl;
                b1=Double.valueOf(in1.getText().toString().trim());
                b2=Double.valueOf(in2.getText().toString().trim());
                hsl=b1*b2;
                String hasil=String.valueOf(hsl);
                out.setText(hasil);
            }
        });

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double b1, b2, hsl;
                b1=Double.valueOf(in1.getText().toString().trim());
                b2=Double.valueOf(in2.getText().toString().trim());
                hsl=b1/b2;
                String hasil=String.valueOf(hsl);
                out.setText(hasil);
            }
        });

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double b1, b2, hsl;
                b1=Double.valueOf(in1.getText().toString().trim());
                b2=Double.valueOf(in2.getText().toString().trim());
                hsl=b1-b2;
                String hasil=String.valueOf(hsl);
                out.setText(hasil);
            }
        });

    }
        }
