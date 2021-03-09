package com.tmimi.a3tiers_users.utils;

import android.app.Application;

import com.tmimi.a3tiers_users.business.DefaultServices;
import com.tmimi.a3tiers_users.business.Services;
import com.tmimi.a3tiers_users.dao.MemoryUserDao;
import com.tmimi.a3tiers_users.dao.RealmUserDao;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MyContext  extends Application {
    private Services services;

    public MyContext()
    {

    }

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        String realmName = "3tiere_users";
        RealmConfiguration config = new RealmConfiguration.Builder().name(realmName).build();
        Realm backgroundThreadRealm = Realm.getInstance(config);
        this.services=new DefaultServices(new RealmUserDao());
    }

    public Services getServices() {
        return services;
    }
}
