package com.tao.versiontools_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.loveplusplus.update.UpdateChecker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UpdateChecker.checkForDialog(MainActivity.this);
    }
}
