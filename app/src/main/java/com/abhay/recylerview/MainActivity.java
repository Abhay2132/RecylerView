package com.abhay.recylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    nameCardAdapter adapter;
    RecyclerView recyclerView;
    ClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        List names = new ArrayList();
        names = getData();

        recyclerView = (RecyclerView) findViewById(R.id.names_view);
        listener = new ClickListener(){
            @Override
            public void click(String naam){
                Toast.makeText(MainActivity.this, "You clicked on " + naam, Toast.LENGTH_SHORT).show();
            }
        };

        adapter = new nameCardAdapter(names, MainActivity.this, listener);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

    private List getData (){
        List names = new ArrayList();
        names.add(new nameData("Abhay"));
        names.add(new nameData("Sumit"));
        names.add(new nameData("Sarthak"));
        names.add(new nameData("Shubham"));
        return names;
    }
}