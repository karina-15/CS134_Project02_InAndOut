package edu.miracosta.cs134.kelias.inandout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SummaryActivity extends AppCompatActivity {

    // Instance variables
    // in activity_summary.xml
    private TextView orderTotalTextView;
    private TextView itemsOrderedTextView;
    private TextView subtotalTextView;
    private TextView taxTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        // "Wire up" instance variables (initialize them)
        orderTotalTextView = findViewById(R.id.orderTotalTextView);
        itemsOrderedTextView = findViewById(R.id.itemsOrderedTextView);
        subtotalTextView = findViewById(R.id.subtotalTextView);
        taxTextView = findViewById(R.id.taxTextView);

        // Receive the intent (from OrderActivity)
        Intent intent = getIntent();

        // Populate the text views with the data from the order model
        orderTotalTextView.setText(intent.getStringExtra("OrderTotal"));
        itemsOrderedTextView.setText(intent.getStringExtra("ItemsOrdered"));
        subtotalTextView.setText(intent.getStringExtra("Subtotal"));
        taxTextView.setText(intent.getStringExtra("Tax"));
    }

    public void returnToOrderActivity(View v) {
        // Done with SummaryActivity, so "finish" / terminate it
        finish();
    }
}
