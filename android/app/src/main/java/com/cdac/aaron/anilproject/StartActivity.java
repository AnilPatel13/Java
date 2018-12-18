package com.cdac.aaron.anilproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class StartActivity extends AppCompatActivity {

    ImageView buttonPresentValue, buttonFutureValue, buttonIncomeTax, buttonLoanCalculator;
    Intent intentChoose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        getSupportActionBar().hide();

        buttonPresentValue = (ImageView) findViewById(R.id.presentValue);
        buttonFutureValue = (ImageView) findViewById(R.id.futureValue);
        buttonIncomeTax = (ImageView) findViewById(R.id.incomeTax);
        buttonLoanCalculator = (ImageView) findViewById(R.id.loanCalculator);

        buttonPresentValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intentChoose = new Intent(StartActivity.this, MainActivityPresent.class);
                startActivity(intentChoose);

            }
        });

        buttonFutureValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            intentChoose = new Intent(StartActivity.this, MainActivity.class);
                startActivity(intentChoose);

            }
        });

    }
}
