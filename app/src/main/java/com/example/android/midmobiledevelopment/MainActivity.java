package com.example.android.midmobiledevelopment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mButtonKubus, mButtonBalok, mButtonBola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonBalok = findViewById(R.id.button_volume_balok);
        mButtonBola = findViewById(R.id.button_volume_bola);
        mButtonKubus = findViewById(R.id.button_volume_kubus);

        mButtonKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HitungKubusActivity.class);
                startActivity(intent);
            }
        });

        mButtonBola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HitungBolaActivity.class);
                startActivity(intent);
            }
        });

        mButtonBalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HitungBalokActivity.class);
                startActivity(intent);
            }
        });
    }
}
