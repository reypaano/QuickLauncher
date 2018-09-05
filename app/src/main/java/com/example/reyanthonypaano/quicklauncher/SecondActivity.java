package com.example.reyanthonypaano.quicklauncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("Something")) {
            TextView toEditTextView = (TextView) findViewById(R.id.toEditTextView);
            String text = getIntent().getExtras().getString("Something");
            toEditTextView.setText(text);
        }
    }
}
