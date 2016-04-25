package com.example.admin.w5d1leakcanary;

import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by admin on 4/25/2016.
 */
public class SaveToDB extends AsyncTask<Void, Void, Void> {
    @Override
    protected Void doInBackground(Void... params) {
        for (int i = 0; i < 100000; i++){
            try {
                Thread.sleep(4000);
                Log.d("TAG", "doInBackground: ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
