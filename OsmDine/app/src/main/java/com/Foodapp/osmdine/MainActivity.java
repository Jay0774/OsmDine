package com.Foodapp.osmdine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;

import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.btnSignUp);
        b2=(Button) findViewById(R.id.btnSignIn);
        final Intent intent1 = new Intent(this , sign_up.class);
        final Intent intent2 = new Intent(this , sign_in.class);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intent1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intent2);
            }
        });


    }
}