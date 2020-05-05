package com.example.healthmonitoring;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.HashSet;
import java.util.Set;

public class VitalRecord extends AppCompatActivity {

    private static final String TAG="MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vital_record);

        saveVital();
    }

    private void saveVital() {
        Button bt_saveVital = findViewById(R.id.bt_save_vital);
        bt_saveVital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i(TAG, getString(R.string.log_save));

                EditText weight = findViewById(R.id.et_weight);
                EditText numberOfSteps = findViewById(R.id.et_number_of_steps);

                String userWeight = weight.getText().toString();
                String userSteps = numberOfSteps.getText().toString();

                try {
                    int userWeightInt = Integer.parseInt(userWeight);
                    int userStepsInt = Integer.parseInt(userSteps);
                } catch (Exception e) {
                    Toast.makeText(VitalRecord.this, getString(R.string.error),
                            Toast.LENGTH_LONG).show();

                    Log.e(TAG, getString(R.string.exception), e);
                }

                Toast.makeText(VitalRecord.this, R.string.save_date,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}