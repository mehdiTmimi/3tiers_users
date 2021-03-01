package com.tmimi.a3tiers_users.presentation.controllers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import com.tmimi.a3tiers_users.R;
import com.tmimi.a3tiers_users.utils.MyContext;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycle);
        button=findViewById(R.id.button);


    }
}