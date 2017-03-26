package com.legacy.con2share.con2share;

import android.content.Context;

import com.legacy.con2share.con2share.injections.annotation.ApplicationContext;

import javax.inject.Inject;

/**
 * Created by Admin on 26.03.2017.
 */

public class DataManager {

    private Context context;

    @Inject
    public DataManager(@ApplicationContext Context context) {
        this.context = context;
    }

    public String geToken(){
        return context.getPackageName();
    }
}
