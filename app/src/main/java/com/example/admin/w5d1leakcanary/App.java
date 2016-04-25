package com.example.admin.w5d1leakcanary;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by admin on 4/25/2016.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
