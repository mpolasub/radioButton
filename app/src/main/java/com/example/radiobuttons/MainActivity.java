package com.example.radiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.rgID);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                radioButton = (RadioButton) findViewById(i);
                switch (radioButton.getId()) {
                    case R.id.yesID: {
                        if(radioButton.isChecked()) { // if statement is optional
                            Log.d("RD", "YES!");
                        }
                    }
                    break;
                    case R.id.noID: {
                        if(radioButton.isChecked()) {
                            Log.d("RD", "NO!");
                        }
                    }
                    break;
                    case R.id.maybeID: {
                        if(radioButton.isChecked()) {
                            Log.d("RD", "Maybe");
                        }
                    }
                    break;
                }
            }
        });
    }
}