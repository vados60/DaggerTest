package com.legacy.con2share.con2share.injections;

import android.content.Context;
import android.support.annotation.NonNull;

import com.legacy.con2share.con2share.PreferenceHelper;
import com.legacy.con2share.con2share.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PreferenceModule {
    @Provides
    @NonNull
    @Singleton
    PreferenceHelper providePreferenceManager(Context context){
        return new PreferenceManager(context);
    }
}
