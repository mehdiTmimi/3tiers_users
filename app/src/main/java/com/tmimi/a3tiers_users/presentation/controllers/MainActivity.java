package com.tmimi.a3tiers_users.presentation.controllers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.tmimi.a3tiers_users.R;
import com.tmimi.a3tiers_users.models.User;
import com.tmimi.a3tiers_users.utils.CustomAdapter;
import com.tmimi.a3tiers_users.utils.CustomUserAdapter;
import com.tmimi.a3tiers_users.utils.MyContext;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ListView listView;
    private MyContext context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context= (MyContext) getApplicationContext();
        listView=findViewById(R.id.list_view);
        CustomUserAdapter customAdapter=new CustomUserAdapter(context);
        listView.setAdapter(customAdapter);
    }
}