package com.legacy.con2share.con2share.injections;

import android.content.Context;
import android.support.annotation.NonNull;

import com.legacy.con2share.con2share.injections.annotation.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Admin on 24.03.2017.
 */

@Module
public class AppModule {

    private Context appCont;

    public AppModule(@NonNull Context context){
        appCont = context;
    }

    @Provides
    @Singleton
    @ApplicationContext
    Context provideContext(){
        return appCont;
    }

}
