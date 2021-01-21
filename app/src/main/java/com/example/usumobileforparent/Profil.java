package com.example.usumobileforparent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }
    public void Logout(View view) {
        Intent intent = new Intent(Profil.this, Login_page.class);
        startActivity(intent);
    }
    public void Home(View view) {
        Intent intent = new Intent(Profil.this, MainActivity.class);
        startActivity(intent);
    }
    public void Akademik(View view) {
        Intent intent = new Intent(Profil.this, Akademik.class);
        startActivity(intent);
    }
    public void Jadwal(View view) {
        Intent intent = new Intent(Profil.this, Jadwal.class);
        startActivity(intent);
    }
    public void Profil(View view) {
        Intent intent = new Intent(Profil.this, Profil.class);
        startActivity(intent);
    }
    public void Notif(View view) {
        Intent intent = new Intent(Profil.this, Notif.class);
        startActivity(intent);
    }
}