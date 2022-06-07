package com.example.a10119258uts;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/*
NIM     : 10119258
Nama    : Akmal Jihad Fauzan
Kelas   : IF-7
 */

public class ActivitySplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashschreen);

        final Handler handler = new Handler();
        handler.postDelayed(() -> {
            startActivity(new Intent(getApplicationContext(), ActivityWelcomeDialog.class));
            finish();
        }, 2000L); // membuat delay selama 2 detik
    }

}