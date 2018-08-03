package com.pacific03.managemoney;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SpentMoney extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spent_money);

        Button spentMoneyBtn = (Button)findViewById(R.id.spentMoneyBtn);
        spentMoneyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText spentAmount = (EditText)findViewById(R.id.spentAmount);
                TextView spentMoneyAmount = (TextView)findViewById(R.id.spentMoneyAmount);

                double newSpent = Double.parseDouble(spentAmount.getText().toString());
                double currentSpent = Double.parseDouble(spentMoneyAmount.getText().toString());
                double result = newSpent + currentSpent;
                spentMoneyAmount.setText(result+"");
            }
        });
//        if(getIntent().hasExtra("com.pacific03.managemoney.SOMETHING")){
//            TextView tv = (TextView)findViewById(R.id.textView);
//            String text = getIntent().getExtras().getString("com.pacific03.managemoney.SOMETHING");
//            tv.setText(text);
//
//        }
    }
}
