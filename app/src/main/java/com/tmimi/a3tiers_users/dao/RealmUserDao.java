package com.tmimi.a3tiers_users.dao;

import android.util.Log;

import com.tmimi.a3tiers_users.models.User;

import java.util.List;

import io.realm.Realm;

public class RealmUserDao implements UserDao{
    private Realm realm;
    private int count;
    public RealmUserDao()
    {
        realm=Realm.getDefaultInstance();
        try {
            count = realm.where(User.class).max("id").intValue();
        }
        catch (Exception e)
        {
            count=0;
        }
    }
    @Override
    public User addUser(User user) {
        count++;
        user.setId(count);
        try {
            realm.beginTransaction();
            realm.insert(user);
            realm.commitTransaction();
            return user;
        }
        catch (Exception e)
        {
            return null;
        }

    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public boolean deleteUser(int id) {
        Log.d("3tiers_app","before try");
        try {
            realm.beginTransaction();
            realm.where(User.class).equalTo("id",id).findFirst().deleteFromRealm();
            Log.d("3tiers_app","inside delete");
            realm.commitTransaction();
            return true;
        }
        catch (Exception e)
        {
            Log.d("3tiers_app",e.getMessage());
            realm.cancelTransaction();
            return false;
        }
    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return realm.where(User.class).findAll();
    }
}
