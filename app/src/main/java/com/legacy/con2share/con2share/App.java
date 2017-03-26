package com.legacy.con2share.con2share;

import android.app.Application;

import com.legacy.con2share.con2share.injections.AppComponent;
import com.legacy.con2share.con2share.injections.AppModule;
import com.legacy.con2share.con2share.injections.DaggerAppComponent;
import com.legacy.con2share.con2share.injections.PreferenceModule;

import timber.log.Timber;

/**
 * Created by Admin on 24.03.2017.
 */

public class App extends Application {

    private static AppComponent appComponent;

    public static AppComponent getAppComponent(){
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .preferenceModule(new PreferenceModule())
                .build();
    }
}
