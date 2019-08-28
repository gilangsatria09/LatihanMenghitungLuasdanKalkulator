package com.example.menghitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etPanjang,etLebar;
    private Button btnHasil;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        etPanjang = (EditText)findViewById(R.id.edit_panjang);
        etLebar = (EditText)findViewById(R.id.edit_lebar);
        btnHasil = (Button)findViewById(R.id.btnHitung);
        txtLuas = (TextView)findViewById(R.id.txtLuas);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjang = etPanjang.getText().toString().trim();
                String lebar = etLebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);

                double luas = p * l;
                txtLuas.setText("Luas : " +luas);
            }
        });
    }
}
