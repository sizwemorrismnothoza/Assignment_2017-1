package com.example.admin.trailerhire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    Button calculate;
    EditText entered_hours, entered_rate;
    TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        entered_hours = (EditText)findViewById(R.id.edt_hours);
        entered_rate = (EditText)findViewById(R.id.edt_rates);
        total =(TextView)findViewById(R.id.total);
        calculate =(Button)findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int hour = Integer.parseInt(entered_hours.getText().toString());
                double rate = Double.parseDouble(entered_rate.getText().toString());
                Pay x = new Pay(hour,rate);
                total.setText("Total wage due R"+x.calculatePay());
            }
        });


    }
}
