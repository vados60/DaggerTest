package com.legacy.con2share.con2share.injections;

import android.content.Context;
import android.support.annotation.NonNull;

import com.legacy.con2share.con2share.PreferenceHelper;
import com.legacy.con2share.con2share.PreferenceManager;
import com.legacy.con2share.con2share.injections.annotation.ActivityContext;
import com.legacy.con2share.con2share.injections.annotation.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PreferenceModule {

    private Context context;

    public PreferenceModule(Context context) {
        this.context = context;
    }

    @Provides
    @ActivityContext
    public Context provideContext(){
        return this.context;
    }

    @Provides
    @NonNull
    @Singleton
    PreferenceHelper providePreferenceManager(){
        return new PreferenceManager(context);
    }
}
