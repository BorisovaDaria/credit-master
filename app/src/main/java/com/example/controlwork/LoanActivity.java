package com.example.controlwork;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoanActivity extends Activity {

    EditText etAmount, etPeriod, etPercent;
    TextView tvPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan);

        Button btnCalc = (Button) findViewById(R.id.button3);
        etAmount = (EditText) findViewById(R.id.editTextNumber);
        etPeriod = (EditText) findViewById(R.id.editTextNumber2);
        etPercent = (EditText) findViewById(R.id.editTextNumber3);
        tvPayment = (TextView) findViewById(R.id.textView5);

        btnCalc.setOnClickListener(calcListener);
    }

    View.OnClickListener calcListener = view -> {
        if (etAmount.getText().toString().equals("")
                || etPeriod.getText().toString().equals("")
                || etPercent.getText().toString().equals("")) return;
        int amount = Integer.parseInt(etAmount.getText().toString());
        int period = Integer.parseInt(etPeriod.getText().toString());
        double percent = 0.01 * Integer.parseInt(etPercent.getText().toString());
        double payment = (amount * ((percent * Math.pow(1+percent, period))/(Math.pow(1+percent, period) - 1)));
        int p = (int) payment;
        System.out.println(p);
        tvPayment.setText(String.valueOf(p));
    };
}
