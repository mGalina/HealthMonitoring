package com.example.healthmonitoring;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import java.util.HashSet;

public class PressureRecording extends AppCompatActivity {

    private static final String TAG="MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure_recording);

        savePressure();
    }

    private void savePressure() {
        Button bt_savePressure = findViewById(R.id.bt_save_pressure);
        bt_savePressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i(TAG, getString(R.string.log_save));

                EditText topPressure = findViewById(R.id.et_top_pressure);
                EditText lowerPressure = findViewById(R.id.et_lower_pressure);
                EditText pulse = findViewById(R.id.et_pulse);
                CheckBox tachycardia = findViewById(R.id.cb_tachycardia);
                EditText date = findViewById(R.id.date);
                EditText time = findViewById(R.id.time);

                String userTopPressure = topPressure.getText().toString();
                String userLowerPressure = lowerPressure.getText().toString();
                String userPulse = pulse.getText().toString();
//                boolean userTachycardia = tachycardia. //не знаю как записать
                String dateOfRecording = date.getText().toString();
                String recordingTime = time.getText().toString();

                try {
                    int userTopPressureInt = Integer.parseInt(userTopPressure);
                    int userLowerPressureInt = Integer.parseInt(userLowerPressure);
                    int userPulseInt = Integer.parseInt(userPulse);
//                boolean userTachycardiaBool = //не знаю как записать
                    int dateOfRecordingInt = Integer.parseInt(dateOfRecording);
                    int recordingTimeInt = Integer.parseInt(recordingTime);
                } catch (Exception e) {
                    Toast.makeText(PressureRecording.this, getString(R.string.error),
                            Toast.LENGTH_LONG).show();

                    Log.e(TAG, getString(R.string.exception), e);
                }

                Toast.makeText(PressureRecording.this, R.string.save_date,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
