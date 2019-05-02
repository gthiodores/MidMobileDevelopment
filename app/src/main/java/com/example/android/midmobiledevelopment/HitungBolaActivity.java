package com.example.android.midmobiledevelopment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HitungBolaActivity extends AppCompatActivity {
    private final double PI = 3.14;
    private EditText mEditJari;
    private Button mButtonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_bola);

        mEditJari = findViewById(R.id.edit_jari);

        mButtonHitung = findViewById(R.id.button_hitung_bola);

        mButtonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jari;

                jari = mEditJari.getText().toString();

                Double jariAngka = Double.parseDouble(jari);

                Double hasil = (jariAngka * jariAngka * jariAngka * PI * 4 )/ 3;

                Intent intent = new Intent(HitungBolaActivity.this, HasilActivity.class);
                intent.putExtra("HASIL", hasil);

                startActivity(intent);
            }
        });
    }
}
