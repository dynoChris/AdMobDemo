package com.oliverstudio.admobdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    //replace it for real id before publishing
    public static final String TEST_AD_APP_ID = "ca-app-pub-3940256099942544~3347511713";
    public static final String YOUR_DEVICE_ID = "749EBAA0259D4EE8EFE4FE805B639875";

    AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, TEST_AD_APP_ID);

        mAdView = findViewById(R.id.ad_view);
        //this approach for realise build
//        AdRequest adRequest = new AdRequest.Builder().build();
        //this approach for test (debug) build
        AdRequest adRequest = new AdRequest.Builder().addTestDevice(YOUR_DEVICE_ID).build();
        mAdView.loadAd(adRequest);
    }
}
