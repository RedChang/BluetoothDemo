package com.example.zhang.common.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by zhang on 9/13/16.
 */
public class SampleActivityBase extends FragmentActivity {

    public static final String TAG = "SampleActivityBase";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        initializeLogging();
    }

    public void initializeLogging() {
        // TODO Log things
    }
}
