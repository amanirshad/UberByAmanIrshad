package com.amanirshad.uberbyaman;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

import io.reactivex.Completable;
import io.reactivex.android.schedulers.AndroidSchedulers;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        delaySplashScreen();
    }

    private void delaySplashScreen() {
        Completable.timer(5, TimeUnit.SECONDS,
                AndroidSchedulers.mainThread())
                .subscribe(() -> Toast.makeText(SplashScreenActivity.this, "Splash Screen done!!...", Toast.LENGTH_SHORT).show());
    }
}