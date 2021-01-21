package com.example.usumobileforparent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Akademik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akademik);
    }
    public void Home(View view) {
        Intent intent = new Intent(Akademik.this, MainActivity.class);
        startActivity(intent);
    }
    public void Akademik(View view) {
        Intent intent = new Intent(Akademik.this, Akademik.class);
        startActivity(intent);
    }
    public void Jadwal(View view) {
        Intent intent = new Intent(Akademik.this, Jadwal.class);
        startActivity(intent);
    }
    public void Profil(View view) {
        Intent intent = new Intent(Akademik.this, Profil.class);
        startActivity(intent);
    }
    public void Notif(View view) {
        Intent intent = new Intent(Akademik.this, Notif.class);
        startActivity(intent);
    }
}