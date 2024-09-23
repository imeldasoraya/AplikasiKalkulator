package com.example.aplikasikalkulator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Latihan1 extends AppCompatActivity {
Button btTambahLatihan1;
Button btKurangLatihan1;
Button btKaliLatihan1;
Button btBagiLatihan1;
Button btBersihkanLatihan1;
EditText etInputan1Latihan1;
EditText etInputan2Latihan1;
TextView tvLatihan1;
TextView tvTextHasilLatihan1;
TextView tvHasilLatihan1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_latihan1);
        // coding disini :
        btTambahLatihan1 = findViewById(R.id.btTambahLatihan1);
        btKurangLatihan1 = findViewById(R.id.btKurangLatihan1);
        btKaliLatihan1 = findViewById(R.id.btKaliLatihan1);
        btBagiLatihan1 = findViewById(R.id.btBagiLatihan1);
        btBersihkanLatihan1 = findViewById(R.id.btBersihkanLatihan1);
        etInputan1Latihan1 = findViewById(R.id.etInputan1Latihan1);
        etInputan2Latihan1 = findViewById(R.id.etInputan2Latihan1);
        tvLatihan1 = findViewById(R.id.tvLatihan1);
        tvTextHasilLatihan1 = findViewById(R.id.tvTextHasilLatihan1);
        tvHasilLatihan1 = findViewById(R.id.tvHasilLatihan1);

        btTambahLatihan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double bil1, bil2, hasil;
                bil1=Double.valueOf(etInputan1Latihan1.getText().toString().trim());
                bil2=Double.valueOf(etInputan2Latihan1.getText().toString().trim());
                hasil=bil1+bil2;
                tvHasilLatihan1.setText("" + hasil);
            }
        });
        btKurangLatihan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double bil1, bil2, hasil;
                bil1=Double.valueOf(etInputan1Latihan1.getText().toString().trim());
                bil2=Double.valueOf(etInputan2Latihan1.getText().toString().trim());
                hasil=bil1-bil2;
                tvHasilLatihan1.setText("" + hasil);
            }
        });
        btKaliLatihan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double bil1, bil2, hasil;
                bil1=Double.valueOf(etInputan1Latihan1.getText().toString().trim());
                bil2=Double.valueOf(etInputan2Latihan1.getText().toString().trim());
                hasil=bil1*bil2;
                tvHasilLatihan1.setText("" + hasil);
            }
        });
        btBagiLatihan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double bil1, bil2, hasil;
                bil1=Double.valueOf(etInputan1Latihan1.getText().toString().trim());
                bil2=Double.valueOf(etInputan2Latihan1.getText().toString().trim());
                hasil=bil1/bil2;
                tvHasilLatihan1.setText("" + hasil);
            }
        });
        btBersihkanLatihan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etInputan1Latihan1.setText("");
                etInputan2Latihan1.setText("");
                tvHasilLatihan1.setText("");
            }
        });
    }
}