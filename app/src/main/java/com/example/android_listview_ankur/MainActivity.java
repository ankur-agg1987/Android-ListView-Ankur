package com.example.android_listview_ankur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    TextView tv;
    String[] items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.mylistview);
        tv =(TextView) findViewById(R.id.textView2);
        items = getResources().getStringArray(R.array.Subject);
        String[] myarray = {"Apple", "Cat", "Orange", "Dog", "a", "b", "c","d"};
        final ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.mylayout, R.id.textView2, myarray);

        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = arrayAdapter.getItem(i).toString();
                Toast.makeText(getApplicationContext(),"you have selected: "+value,Toast.LENGTH_SHORT).show();
            }
        });
    }
}