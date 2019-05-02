package com.github.novotnyr.android.fotic;

import androidx.appcompat.app.AppCompatActivity;
import io.fotoapparat.view.CameraView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CameraView cameraView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.cameraView = findViewById(R.id.cameraView);
    }

    public void onSnapButtonClick(View view) {
    }
}
