package com.example.monic.monicaharuna;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {   //Automatic
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button RegButton = findViewById (R.id.Register);  //Register button created
        RegButton.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View V)
                    {
                        Intent myIntent = new Intent(V.getContext(),RegisterActivity.class);
                        startActivity(myIntent);
                        //v.getContext() is where we are at now and RegisterActivity class is where we want to go
                    }
                }
        );

      //  Button LogInButton = findViewById(R.id.LogIn
      //  LogInButton.setOnClickListener(
      //          new
      //  );



    }

}
