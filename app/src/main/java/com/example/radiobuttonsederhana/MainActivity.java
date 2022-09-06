package com.example.radiobuttonsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioGroup rgJawaban1 = (RadioGroup) findViewById(R.id.rgJawaban1);
        Button btSubmit = (Button) findViewById(R.id.btnJawab);
        btSubmit.setOnClickListener((view) -> {
            int id = rgJawaban1.getCheckedRadioButtonId();
            switch (id) {
                case R.id.jwb1:
                    Toast.makeText(getApplicationContext(), "Anda Salah jika memilih "+
                            ((RadioButton)findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;

                case R.id.jwb2:
                    Toast.makeText(getApplicationContext(), "Anda Salah jika memilih " +
                            ((RadioButton)findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;

                case R.id.jwb3:
                    Toast.makeText(getApplicationContext(), "Anda Benar jika memilih " +
                            ((RadioButton)findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
            }
        } );
    }
}