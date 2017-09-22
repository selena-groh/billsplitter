package io.github.selena_groh.tinyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplaySplitAmount extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_split_amount);

        Intent intent = getIntent();
        Float splitAmount = intent.getFloatExtra(MainActivity.SPLIT_AMOUNT, 0f);

        TextView splitAmountText = (TextView) findViewById(R.id.splitAmountText);
        splitAmountText.setText("$" + String.format("%.2f", splitAmount));
    }
}
