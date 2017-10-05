package com.example.admin.trailerhire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TrailerActivity extends AppCompatActivity {

    Button x;
    TextView y;
    EditText amount, kilometers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trailer);

        amount =(EditText)findViewById(R.id.edt_amount);
        kilometers=(EditText)findViewById(R.id.edt_kilometer);

        y = (TextView)findViewById(R.id.txt_result);

        x = (Button)findViewById(R.id.btn_hire);


        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int zq= Integer.parseInt(amount.getText().toString());
                int yq= Integer.parseInt(kilometers.getText().toString());
                Hire qww = new Hire(zq,yq);
                y.setVisibility(view.VISIBLE);
                y.setText("djbjbf  "+qww.getTotalCost());
            }
        });



    }
}
