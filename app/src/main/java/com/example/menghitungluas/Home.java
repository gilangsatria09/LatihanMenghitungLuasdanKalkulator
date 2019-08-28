package com.example.menghitungluas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Menghitung Luas & Kalkulator");
        Button luas = (Button) findViewById(R.id.Luas);
        luas.setOnClickListener(this);

        Button kalkulator = (Button) findViewById(R.id.Kalkulator);
        kalkulator.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Kalkulator:
                Intent a = new Intent(Home.this,MainKalulator.class);
                startActivity(a);
                break;
            case R.id.Luas:
                Intent i = new Intent(Home.this,MainActivity.class);
                startActivity(i);
                break;
        }


    }
}
