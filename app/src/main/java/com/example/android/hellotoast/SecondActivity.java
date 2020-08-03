package com.example.android.hellotoast;

import com.example.android.hellotoast.MainActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

public class SecondActivity extends Activity {
    private TextView txtHello;
    private TextView txtCount;

    MainActivity mainActivity = new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Bundle bundle = getIntent().getExtras();
        String mCount = bundle.getString("totalCount");

        txtHello = (TextView) findViewById(R.id.hello);
        txtCount = (TextView) findViewById(R.id.count);

        txtHello.setText(R.string.new_message);
        txtCount.setText(mCount);
    }
}
