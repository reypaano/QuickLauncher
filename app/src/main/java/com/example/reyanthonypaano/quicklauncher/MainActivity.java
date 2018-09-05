package com.example.reyanthonypaano.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secondActivityBtn = (Button) findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startIntent.putExtra("Something", "Hello World!!!");
                startActivity(startIntent );
            }
        });

        //Launch Activity outside our app
        Button toGoogleBtn = (Button) findViewById(R.id.toGoogleBtn);
        toGoogleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String googleAdd = "https://www.google.com";
                Uri webAddress = Uri.parse(googleAdd);

                Intent goToGoogle = new Intent(Intent.ACTION_VIEW);
                goToGoogle.setData(webAddress);
                if (goToGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(goToGoogle);
                }

            }
        });

    }
}
