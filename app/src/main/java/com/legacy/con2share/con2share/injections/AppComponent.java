package com.legacy.con2share.con2share.injections;

import com.legacy.con2share.con2share.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Admin on 24.03.2017.
 */
@Component(modules = {AppModule.class, PreferenceModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
