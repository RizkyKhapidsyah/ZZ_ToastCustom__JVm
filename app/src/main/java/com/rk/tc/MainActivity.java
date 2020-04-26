package com.rk.tc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button B_1_MainActivity_IDJAVA;
    Toast PesanToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B_1_MainActivity_IDJAVA = findViewById(R.id.B_1_MainActivity_IDXML);
        B_1_MainActivity_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PesanToast = Toast.makeText(MainActivity.this, "", Toast.LENGTH_LONG);
                PesanToast.setGravity(Gravity.CENTER, 0, 0);

                View Tampil = getLayoutInflater().inflate(R.layout.toast_custom, (ViewGroup) findViewById(R.id.RLayout_ToastCustom_IDXML));
                PesanToast.setView(Tampil);
                PesanToast.show();
            }
        });

    }
}
