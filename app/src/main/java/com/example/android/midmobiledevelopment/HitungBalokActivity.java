package com.example.android.midmobiledevelopment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HitungBalokActivity extends AppCompatActivity {
    EditText mEditPanjang, mEditTinggi, mEditLebar;
    Button mButtonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_balok);

        mEditLebar = findViewById(R.id.edit_lebar);
        mEditPanjang = findViewById(R.id.edit_panjang);
        mEditTinggi = findViewById(R.id.edit_tinggi);
        mButtonHitung = findViewById(R.id.button_hitung_balok);

        mButtonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjang, lebar, tinggi;

                panjang = mEditPanjang.getText().toString();
                lebar = mEditLebar.getText().toString();
                tinggi = mEditTinggi.getText().toString();

                Double hasil = Double.parseDouble(panjang) * Double.parseDouble(lebar) * Double.parseDouble(tinggi);

                Intent intent = new Intent(HitungBalokActivity.this, HasilActivity.class);
                intent.putExtra("HASIL", hasil);

                startActivity(intent);
            }
        });

    }
}
