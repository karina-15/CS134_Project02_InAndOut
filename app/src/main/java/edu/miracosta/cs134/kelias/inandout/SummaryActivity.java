package edu.miracosta.cs134.kelias.inandout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * SummaryActivity
 * Displays calculations and information from OrderActivity
 */
public class SummaryActivity extends AppCompatActivity {

    // Instance variables
    // in activity_summary.xml
    private TextView orderTotalTextView;
    private TextView itemsOrderedTextView;
    private TextView subtotalTextView;
    private TextView taxTextView;

    // variable to save TextView label
    String orderTotalLabel, itemsOrderedLabel, subtotalLabel, taxLabel;

    /**
     * Creates the Summary Activity and retrieves Intent information
     * to display in TextViews
     * @param savedInstanceState    state of Activity
     */
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
        // get TextView text before displaying calculations
        orderTotalLabel = (String) orderTotalTextView.getText();
        itemsOrderedLabel = (String) itemsOrderedTextView.getText();
        subtotalLabel = (String) subtotalTextView.getText();
        taxLabel = (String) taxTextView.getText();
        // Populate the text views with the data from the order model
        orderTotalTextView.setText(String.format("%s %s", orderTotalLabel,
                intent.getStringExtra("OrderTotal")));
        itemsOrderedTextView.setText(String.format("%s%s", itemsOrderedLabel,
                intent.getStringExtra("ItemsOrdered")));
        subtotalTextView.setText(String.format("%s %s", subtotalLabel,
                intent.getStringExtra("Subtotal")));
        taxTextView.setText(String.format("%s %s", taxLabel,
                intent.getStringExtra("Tax")));
    }

    /**
     * When startNewOrderButton is pressed this activity is done
     * and returns to OrderActivity
     * @param v view
     */
    public void returnToOrderActivity(View v) {
        // Done with SummaryActivity, so "finish" / terminate it
        finish();
    }
}
