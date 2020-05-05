package com.example.healthmonitoring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.UserData;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    static Set<UserData> userData = new HashSet<>();
    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveUser();
        pressureSwitching();
        vitalSwitching();
    }

    public void saveUser() {
        Button saveUser = findViewById(R.id.bt_save_user);
        saveUser.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Log.i(TAG, getString(R.string.log_save));

                EditText surname = findViewById(R.id.et_surname);
                EditText name = findViewById(R.id.et_name);
                EditText patronymic = findViewById(R.id.et_patronymic);
                EditText age = findViewById(R.id.et_age);

                String userSurname = surname.getText().toString();
                String userName = name.getText().toString();
                String userPatronymic = patronymic.getText().toString();
                String userAge = age.getText().toString();


                try {
                    int userAgeInt = Integer.parseInt(userAge);
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, getString(R.string.error),
                            Toast.LENGTH_LONG).show();

                    Log.e(TAG, getString(R.string.exception), e);
                }

                Toast.makeText(MainActivity.this, R.string.save_date,
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    private void pressureSwitching() {
        Button pressureRecording = findViewById(R.id.bt_pressure_recording);
        pressureRecording.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i(TAG, getString(R.string.pressure_switching));

                Intent intent = new Intent(getApplicationContext(), PressureRecording.class);
                startActivity(intent);
            }
        });
    }

    private void vitalSwitching() {
        Button vitalRecord = findViewById(R.id.bt_vital_record);
        vitalRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i(TAG, getString(R.string.vital_switching));

                Intent intent = new Intent(getApplicationContext(), VitalRecord.class);
                startActivity(intent);
            }
        });
    }
}
