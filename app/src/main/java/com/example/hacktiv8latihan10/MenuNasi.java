package com.example.hacktiv8latihan10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MenuNasi extends AppCompatActivity {
    ListView listView;
    String[] makanan = {"NASI GORENG AYAM","NASI GORENG BABAT","NASI GORENG KECAP","NASI GORENG SAYUR","NASI GORENG MAWUT"};
    int[] gbr = {R.drawable.nasgor2,R.drawable.nasgor3,R.drawable.nasgor4,R.drawable.nasgor5,R.drawable.nasgor6};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_nasi);

        listView = findViewById(R.id.list);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),makanan[i],Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),tampillist.class);
                intent.putExtra("name",makanan[i]);
                intent.putExtra("image",gbr[i]);
                startActivity(intent);

            }
        });



    }


    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return gbr.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.activity_list_view,null);
            //getting view in row_data
            TextView name = view1.findViewById(R.id.textt);
            ImageView image = view1.findViewById(R.id.gbr);

            name.setText(makanan[i]);
            image.setImageResource(gbr[i]);
            return view1;
        }
    }
}