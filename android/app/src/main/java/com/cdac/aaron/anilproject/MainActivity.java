package com.cdac.aaron.anilproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumberOfPeriod, editTextStartAmount, editTextInterestRate, editTextPeriodicDeposit;
    Switch switchBeginningEnd;
    Button buttonCalculate;
    String switchBegEnd = "beginning";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        editTextNumberOfPeriod = (EditText)findViewById(R.id.editTextNumberOfPeriods);
        editTextStartAmount = (EditText)findViewById(R.id.editTextStartAmmount);
        editTextInterestRate = (EditText)findViewById(R.id.editTextInterestRate);
        editTextPeriodicDeposit = (EditText)findViewById(R.id.editTextPeriodicDeposite);

        switchBeginningEnd = (Switch)findViewById(R.id.switchBegainingEnd);

        buttonCalculate = (Button)findViewById(R.id.buttonCalculate);

        switchBeginningEnd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    switchBeginningEnd.setText("beginning");
                    switchBegEnd = "beginning";
                    Toast.makeText(MainActivity.this,"begaining",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    switchBeginningEnd.setText("end");
                    switchBegEnd = "end";
                    Toast.makeText(MainActivity.this,"end",Toast.LENGTH_SHORT).show();
                }
            }
        });

        editTextStartAmount.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                editTextStartAmount.setText("");
                return false;
            }
        });
        editTextInterestRate.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                editTextInterestRate.setText("");
                return false;
            }
        });
        editTextPeriodicDeposit.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                editTextPeriodicDeposit.setText("");
                return false;
            }
        });

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGraph = new Intent(MainActivity.this, NavigationActivity.class);

                SharedPreferences sharedPreferences = getSharedPreferences("data",MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putString("numberOfPeriod",editTextNumberOfPeriod.getText().toString());
                editor.putString("startAmount",editTextStartAmount.getText().toString());
                editor.putString("interestRate",editTextInterestRate.getText().toString());
                editor.putString("periodicDeposit",editTextPeriodicDeposit.getText().toString());
                editor.putString("switchBegEnd",switchBegEnd);
                editor.commit();

                startActivity(intentGraph);
            }
        });

    }
}
