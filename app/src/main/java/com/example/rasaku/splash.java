package com.example.rasaku;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {
    // Durasi splash screen dalam milidetik (3000ms = 3 detik)
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Pindah ke MainActivity setelah waktu yang ditentukan
                Intent homeIntent = new Intent(splash.this, MainActivity.class);
                startActivity(homeIntent);
                finish(); // Menutup activity splash screen agar tidak bisa kembali
            }
        }, SPLASH_TIME_OUT);
    }
}