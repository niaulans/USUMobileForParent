package com.example.usumobileforparent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Notif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notif);
    }
    public void Home(View view) {
        Intent intent = new Intent(Notif.this, MainActivity.class);
        startActivity(intent);
    }
    public void Akademik(View view) {
        Intent intent = new Intent(Notif.this, Akademik.class);
        startActivity(intent);
    }
    public void Jadwal(View view) {
        Intent intent = new Intent(Notif.this, Jadwal.class);
        startActivity(intent);
    }
    public void Profil(View view) {
        Intent intent = new Intent(Notif.this, Profil.class);
        startActivity(intent);
    }
    public void Notif(View view) {
        Intent intent = new Intent(Notif.this, Notif.class);
        startActivity(intent);
    }
}