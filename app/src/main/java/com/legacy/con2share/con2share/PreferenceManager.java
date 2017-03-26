package com.legacy.con2share.con2share;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;

/**
 * Created by Admin on 24.03.2017.
 */

public class PreferenceManager implements PreferenceHelper {

    private static final String FILE_NAME = "dagger_test";
    public static final String KEY_FOR_KEY = "sp_key";
    private Context context;
    private SharedPreferences mPreference;

    @Inject
    public PreferenceManager(Context context) {
        this.context = context;
        mPreference = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
    }

    @Override
    public void setKey(String key) {
        mPreference.edit().putString(KEY_FOR_KEY, key).apply();
    }

    @Override
    public String getKey() {
        return mPreference.getString(KEY_FOR_KEY, null);
    }
}
