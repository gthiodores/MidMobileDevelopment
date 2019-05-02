package com.example.android.midmobiledevelopment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class HasilActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        TextView hasilText = findViewById(R.id.text_hasil);

        if(getIntent().hasExtra("HASIL"))
            hasilText.setText(String.valueOf(getIntent().getDoubleExtra("HASIL", 0)));
        else
            Toast.makeText(this, "Data tidak terkirim", Toast.LENGTH_SHORT).show();
    }
}
