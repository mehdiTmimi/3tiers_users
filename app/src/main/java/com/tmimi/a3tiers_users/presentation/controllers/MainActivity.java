package com.tmimi.a3tiers_users.presentation.controllers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
    private CustomUserAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("debug_app","on create executed");
        setContentView(R.layout.activity_main);
        context= (MyContext) getApplicationContext();
        listView=findViewById(R.id.list_view);
        customAdapter=new CustomUserAdapter(context);
        listView.setAdapter(customAdapter);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,AddUserActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        customAdapter.notifyDataSetChanged();
    }
}