package com.pacific03.managemoney;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spentMoneyActivityBtn = (Button)findViewById(R.id.firstActivityBtn);
        spentMoneyActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SpentMoney.class);

//                startIntent.putExtra("com.pacific03.managemoney.SOMETHING", "Hello World");

                startActivity(startIntent);
            }
        });
    }
}
