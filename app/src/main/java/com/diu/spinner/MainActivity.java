package com.diu.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String[] countryNames;
    private Spinner spinner;
    private TextView textView;
    private Button button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryNames=getResources().getStringArray(R.array.country_name);
        spinner = (Spinner) findViewById(R.id.spinnerid);
        textView = (TextView) findViewById(R.id.textviewid);
        button = (Button) findViewById(R.id.buttonid);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.sample_view,R.id.sampleid,countryNames );
        spinner.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = spinner.getSelectedItem().toString();
                textView.setText(value);
            }
        });

    }
}
