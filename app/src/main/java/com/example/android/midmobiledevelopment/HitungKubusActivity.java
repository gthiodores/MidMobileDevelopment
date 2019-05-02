package com.example.android.midmobiledevelopment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HitungKubusActivity extends AppCompatActivity {
    private Button mButtonHitung;
    private EditText mEditRusuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_kubus);

        mButtonHitung = findViewById(R.id.button_hitung_kubus);
        mEditRusuk = findViewById(R.id.edit_rusuk);

        mButtonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rusuk = mEditRusuk.getText().toString();
                Double rusukAngka = Double.parseDouble(rusuk);

                Double hasil = rusukAngka * rusukAngka * rusukAngka;

                Intent intent = new Intent(HitungKubusActivity.this, HasilActivity.class);
                intent.putExtra("HASIL", hasil);
                startActivity(intent);
            }
        });
    }
}
