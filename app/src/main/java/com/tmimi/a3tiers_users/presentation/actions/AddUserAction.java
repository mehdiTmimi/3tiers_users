package com.tmimi.a3tiers_users.presentation.actions;

import android.view.View;
import android.widget.Toast;

import com.tmimi.a3tiers_users.models.User;
import com.tmimi.a3tiers_users.presentation.controllers.AddUserActivity;

public class AddUserAction implements View.OnClickListener {
    private AddUserActivity addUserActivity;
    public AddUserAction(AddUserActivity addUserActivity)
    {
        this.addUserActivity=addUserActivity;
    }
    @Override
    public void onClick(View v)
    {
        String userName=addUserActivity.getUserName().getText().toString();
        String name=addUserActivity.getName().getText().toString();
        String email=addUserActivity.getEmail().getText().toString();
        if(userName.length()==0 || name.length()==0 || email.length()==0)
            Toast.makeText(addUserActivity.getContext()," veuillez remplir tous les champs",Toast.LENGTH_LONG).show();
        else
        {
            User user=new User(userName,name,email);
            if(addUserActivity.getContext().getServices().addUser(user)==null)
                Toast.makeText(addUserActivity.getContext()," erreur ",Toast.LENGTH_LONG).show();
            else
            {
                addUserActivity.finish();
            }
        }
    }
}
