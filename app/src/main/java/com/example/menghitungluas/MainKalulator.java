package com.example.menghitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainKalulator extends AppCompatActivity implements View.OnClickListener {

    EditText vTxtA,vTxtB,vTxtC;
    protected float yTxtA,yTxtB,yTxtC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_kalulator);

        vTxtA = (EditText)findViewById(R.id.txtA);
        vTxtB = (EditText)findViewById(R.id.txtB);
        vTxtC = (EditText)findViewById(R.id.txtC);

        Button btnTambah = (Button)findViewById(R.id.btnTambah);
        Button btnKurang= (Button)findViewById(R.id.btnKurang);
        Button btnKali = (Button)findViewById(R.id.btnKali);
        Button btnBagi = (Button)findViewById(R.id.btnBagi);

        btnTambah.setOnClickListener(this);
        btnKurang.setOnClickListener(this);
        btnKali.setOnClickListener(this);
        btnBagi.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        yTxtA = Float.parseFloat(vTxtA.getText().toString());
        yTxtB = Float.parseFloat(vTxtB.getText().toString());

        switch(v.getId()){
            case R.id.btnTambah:
                yTxtC = yTxtA + yTxtB;
                vTxtC.setText(Float.toString(yTxtC));
                break;
            case R.id.btnKurang:
                yTxtC = yTxtA - yTxtB;
                vTxtC.setText(Float.toString(yTxtC));
                break;
            case R.id.btnKali:
                yTxtC = yTxtA * yTxtB;
                vTxtC.setText(Float.toString(yTxtC));
                break;
            case R.id.btnBagi:
                yTxtC = yTxtA / yTxtB;
                vTxtC.setText(Float.toString(yTxtC));
                break;
        }
    }
}
