package com.tmimi.a3tiers_users.presentation.controllers;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.tmimi.a3tiers_users.R;
import com.tmimi.a3tiers_users.presentation.actions.AddUserAction;
import com.tmimi.a3tiers_users.utils.MyContext;

public class AddUserActivity extends AppCompatActivity {
    private EditText userName;
    private EditText name;
    private EditText email;
    private Button button;
    private MyContext context;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
        userName=findViewById(R.id.user_name_add);
        name=findViewById(R.id.user_add);
        email=findViewById(R.id.email_add);
        button=findViewById(R.id.btn_add);
        context= (MyContext) getApplicationContext();
        AddUserAction addUserAction=new AddUserAction(this);
        button.setOnClickListener(addUserAction);

    }

    public MyContext getContext() {
        return context;
    }

    public EditText getUserName() {
        return userName;
    }

    public EditText getName() {
        return name;
    }

    public EditText getEmail() {
        return email;
    }
}
