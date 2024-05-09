package com.example.androidshii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GoToMainScreen(View v){
        Intent in = new Intent(StartScreen.this, MainScreen.class);
        startActivity(in);
    }

    private Switch switchAction = (Switch) findViewById(R.id.switchact);

    public void SwitchThemes(View v){
        
    }
}