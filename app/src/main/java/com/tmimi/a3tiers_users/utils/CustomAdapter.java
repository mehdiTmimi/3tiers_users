package com.tmimi.a3tiers_users.utils;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import com.tmimi.a3tiers_users.R;
import com.tmimi.a3tiers_users.models.User;

import java.util.List;
//1 - creer un custom adapter -> etendre de la classe BaseAdapter
//2 - creation du layout : afficher 1 seul item user
public class CustomAdapter extends BaseAdapter {
    private List<String> userList;
    private LayoutInflater layoutInflater;
    public CustomAdapter(List<String> users, Context c)
    {
        Log.d("debug_app","adapter construction");
        this.userList=users;
        layoutInflater= LayoutInflater.from(c);
    }
    @Override
    public int getCount() {
        return userList.size();
    }

    @Override
    public Object getItem(int position) {
        return userList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View itemView, ViewGroup parent) {



       if(itemView==null)
        itemView=layoutInflater.inflate(R.layout.button_item,null);

        Button btn1=itemView.findViewById(R.id.btn1);
        Button btn2=itemView.findViewById(R.id.btn2);
        btn1.setText("name : ");
        btn2.setText(userList.get(position));
        return itemView;
    }
}
