package com.example.hacktiv8latihan10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton miegoreng;
    ImageButton nasigoreng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miegoreng = (ImageButton) findViewById(R.id.imageButtonMie);
        miegoreng.setOnClickListener(this);
        nasigoreng = (ImageButton) findViewById(R.id.imageButtonNasi);
        nasigoreng.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButtonMie:
                Intent explicit1 = new Intent(getApplicationContext(), MenuMie.class);
                startActivity(explicit1);
                break;

            case R.id.imageButtonNasi:
                Intent explicit2 = new Intent(getApplicationContext(), MenuNasi.class);
                startActivity(explicit2);
                break;

            default:
                break;
        }
}}