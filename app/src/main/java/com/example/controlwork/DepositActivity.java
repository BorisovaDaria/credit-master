package com.example.controlwork;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DepositActivity extends Activity {

    EditText etAmount, etPeriod, etPercent;
    TextView tvProfit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit);

        Button btnCalc = (Button) findViewById(R.id.button4);
        etAmount = (EditText) findViewById(R.id.editTextNumber4);
        etPeriod = (EditText) findViewById(R.id.editTextNumber5);
        etPercent = (EditText) findViewById(R.id.editTextNumber6);
        tvProfit = (TextView) findViewById(R.id.textView7);

        btnCalc.setOnClickListener(calcListener);
    }

    View.OnClickListener calcListener = view -> {
        if (etAmount.getText().toString().equals("")
                || etPeriod.getText().toString().equals("")
                || etPercent.getText().toString().equals("")) return;
        int amount = Integer.parseInt(etAmount.getText().toString());
        int period = Integer.parseInt(etPeriod.getText().toString());
        double percent = 0.01 * Integer.parseInt(etPercent.getText().toString());
        double profit = period * amount * percent;
        int p = (int) profit;
        System.out.println(p);
        tvProfit.setText(String.valueOf(p));
    };

}
