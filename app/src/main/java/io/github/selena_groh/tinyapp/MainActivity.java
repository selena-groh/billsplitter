package io.github.selena_groh.tinyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String SPLIT_AMOUNT = "io.github.selena-groh.SPLITAMOUNT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onSplitMyBill(View view) {
        Log.d("**** In MainActivity", "SPLITTING BILL");
        // Step 1: get the text view that is in the layout
        EditText amountTxt = (EditText) findViewById(R.id.amount);
        EditText numPeopleTxt = (EditText) findViewById(R.id.numPeople);

        if (amountTxt.getText().toString().equals("") || numPeopleTxt.getText().toString().equals("")) {
            TextView splitAmountText = (TextView) findViewById(R.id.splitAmountText);
            splitAmountText.setText("Required Field Empty");
            splitAmountText.setVisibility(1);
            return;
        }

        Float amount = new Float(amountTxt.getText().toString());
        Integer numPeople = new Integer(numPeopleTxt.getText().toString());

        if (amount > 0 && numPeople > 0) {
            Intent intent = new Intent(this, DisplaySplitAmount.class);
            Float splitAmount = amount / numPeople;
            Log.d("**** In MainActivity", String.format("%.2f", splitAmount));

            intent.putExtra(SPLIT_AMOUNT, splitAmount);
            startActivity(intent);
        }
    }
}