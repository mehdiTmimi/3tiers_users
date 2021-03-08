package com.tmimi.a3tiers_users.utils;

import android.app.Application;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.tmimi.a3tiers_users.R;
import com.tmimi.a3tiers_users.models.User;

import java.util.List;

public class CustomUserAdapter  extends BaseAdapter {
    private MyContext context;
    private List<User> users;
    private LayoutInflater layoutInflater;
    public CustomUserAdapter(Application context){
        Log.d("debug_app","adapter construction");
        this.context= (MyContext) context;
        users=this.context.getServices().getUsers();
        layoutInflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return users.get(position).getId();
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        boolean teste=false;
        if(convertView==null) {
            convertView = layoutInflater.inflate(R.layout.custom_user_item, null);
            teste=true;
        }

        TextView name= convertView.findViewById(R.id.name);
        TextView user_name= convertView.findViewById(R.id.user_name);
        TextView email= convertView.findViewById(R.id.email_add);
        Button btn=convertView.findViewById(R.id.btn_delete);
        if(teste)
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               context.getServices().deleteUser(users.get(position).getId());
               CustomUserAdapter.this.notifyDataSetChanged();
            }
        });
        name.setText(users.get(position).getName());
        user_name.setText(users.get(position).getUserName());
        email.setText(users.get(position).getEmail());
        return convertView;
    }
}
