package com.example.firebase2java;

import android.app.Application;

import com.google.firebase.FirebaseApp;

/**
 * Created by srikant
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
