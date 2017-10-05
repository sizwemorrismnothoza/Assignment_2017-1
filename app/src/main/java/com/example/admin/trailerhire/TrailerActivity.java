package com.example.admin.trailerhire;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TrailerActivity extends AppCompatActivity {

    Button calculate;
    TextView total_cost;
    EditText amount, kilometers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trailer);

        amount =(EditText)findViewById(R.id.edt_amount);
        kilometers=(EditText)findViewById(R.id.edt_kilometer);
        total_cost = (TextView)findViewById(R.id.txt_result);
        calculate = (Button)findViewById(R.id.btn_hire);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int amountEntered= Integer.parseInt(amount.getText().toString());
                int kiloMetersEntered= Integer.parseInt(kilometers.getText().toString());
                Hire hire = new Hire(amountEntered,kiloMetersEntered);
                total_cost.setVisibility(view.VISIBLE);
                total_cost.setText("Total Amount Due:  "+hire.getTotalCost());
            }
        });



    }
}
