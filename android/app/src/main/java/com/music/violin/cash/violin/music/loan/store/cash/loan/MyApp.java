package com.music.violin.cash.violin.music.loan.store.cash.loan;

import android.app.Application;

import io.branch.referral.Branch;

public class MyApp extends Application
{

    @Override
    public void onCreate() {
        super.onCreate();
        onInit();
    }


    private void onInit() {
        Branch.enableLogging();
        Branch.getAutoInstance(this);
    }
}