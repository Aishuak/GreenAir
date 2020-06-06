package com.example.greenair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onBtnClick2 (View v){
        Intent intent2 = new Intent(MainActivity.this, sostoianie_actual.class);
        startActivity(intent2);
    }
    public void onBtnClick (View v){
        Intent intent1 = new Intent("com.example.greenair.chemicalss");
        startActivity(intent1);
    }
    public void onBtnClick3 (View v){
        Intent intent3 = new Intent(MainActivity.this, map.class);
        startActivity(intent3);
    }
}
