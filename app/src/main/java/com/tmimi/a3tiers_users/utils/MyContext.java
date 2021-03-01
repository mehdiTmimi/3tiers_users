package com.tmimi.a3tiers_users.utils;

import android.app.Application;

import com.tmimi.a3tiers_users.business.DefaultServices;
import com.tmimi.a3tiers_users.business.Services;
import com.tmimi.a3tiers_users.dao.MemoryUserDao;

public class MyContext  extends Application {
    private Services services;
    public MyContext()
    {
        this.services=new DefaultServices(new MemoryUserDao());
    }

    public Services getServices() {
        return services;
    }
}
