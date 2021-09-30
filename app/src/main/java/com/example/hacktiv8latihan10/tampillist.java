package com.example.hacktiv8latihan10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class tampillist extends AppCompatActivity implements View.OnClickListener{
    TextView listmakanan,back;
    ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampillist);

        listmakanan = findViewById(R.id.textt);
        gambar = findViewById(R.id.gbr);
        back = (TextView) findViewById(R.id.click);
        back.setOnClickListener(this);
        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("name");
        int receivedImage = intent.getIntExtra("image",0);
        listmakanan.setText(receivedName);
        gambar.setImageResource(receivedImage);
        //enable back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //getting back to listview
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
    public void setBack() {
        super.onBackPressed();
    }
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.click:
                super.onBackPressed();
                break;

            default:
                break;
        }
    }

}