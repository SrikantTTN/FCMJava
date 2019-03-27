package com.example.firebase2java;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;

/**
 * Created by srikant
 */
public class MyFcmMessagingService extends FirebaseMessagingService {
    final String TAG = "MyFcmServiceClass";

    private void scheduleJob() {

    }

    private void handleNow() {

    }

    private void showNotification(String title, String body) {
        Log.e(TAG, title.concat(body));
    }


}
