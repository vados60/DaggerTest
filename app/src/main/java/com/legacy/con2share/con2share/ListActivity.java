package com.legacy.con2share.con2share;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import javax.inject.Inject;


/**
 * Created by Admin on 26.03.2017.
 */

public class ListActivity extends BaseActivity {

    @Inject
    PreferenceHelper preferenceManager;

    @Inject
    DataManager dataManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        App.getAppComponent().inject(this);

        TextView tv = (TextView) findViewById(R.id.main_text);
        tv.setText(preferenceManager.toString());
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText(preferenceManager.getKey());
    }
}
