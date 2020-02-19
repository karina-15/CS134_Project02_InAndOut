package edu.miracosta.cs134.kelias.inandout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.NumberFormat;
import java.util.Locale;

import edu.miracosta.cs134.kelias.inandout.model.Order;

public class OrderActivity extends AppCompatActivity {

    // Instance variables to connect the Controller with the View
    private EditText doubleDoubleEditText;
    private EditText cheeseBurgerEditText;
    private EditText frenchFriesEditText;
    private EditText shakesEditText;
    private EditText smallDrinkEditText;
    private EditText mediumDrinkEditText;
    private EditText largeDrinkEditText;

    private Order order;
    private NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.getDefault());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        // Wire up views
        doubleDoubleEditText = findViewById(R.id.doubleDoubleEditText);
        cheeseBurgerEditText = findViewById(R.id.cheeseBurgerEditText);
        frenchFriesEditText = findViewById(R.id.frenchFriesEditText);
        shakesEditText = findViewById(R.id.shakesEditText);
        smallDrinkEditText = findViewById(R.id.smallDrinkEditText);
        mediumDrinkEditText = findViewById(R.id.mediumDrinkEditText);
        largeDrinkEditText = findViewById(R.id.largeDrinkEditText);
    }

    public void generateOrderSummary(View v) {
        // extract data from the intent
        int doubleDouble, cheeseBurger, frenchFries, shakes, smallDrink, mediumDrink, largeDrink;
        // parse to Integer and toString
        // surround each with try/catch for empty EditText fields
        try {
            doubleDouble = Integer.parseInt(doubleDoubleEditText.getText().toString());
        } catch (NumberFormatException e) {
            doubleDouble = 0;
        }
        try {
            cheeseBurger = Integer.parseInt(cheeseBurgerEditText.getText().toString());
        } catch (NumberFormatException e) {
            cheeseBurger = 0;
        }
        try {
            frenchFries = Integer.parseInt(frenchFriesEditText.getText().toString());
        } catch (NumberFormatException e) {
            frenchFries = 0;
        }
        try {
            shakes = Integer.parseInt(shakesEditText.getText().toString());
        } catch (NumberFormatException e) {
            shakes = 0;
        }
        try {
            smallDrink = Integer.parseInt(smallDrinkEditText.getText().toString());
        } catch (NumberFormatException e) {
            smallDrink = 0;
        }
        try {
            mediumDrink = Integer.parseInt(mediumDrinkEditText.getText().toString());
        } catch (NumberFormatException e) {
            mediumDrink = 0;
        }
        try {
            largeDrink = Integer.parseInt(largeDrinkEditText.getText().toString());
        } catch (NumberFormatException e) {
            largeDrink = 0;
        }
        // Let's send the data to the Model (Order.java)
        order = new Order();
        // set order variables
        order.setDoubleDoubles(doubleDouble);
        order.setCheeseburgers(cheeseBurger);
        order.setFrenchFries(frenchFries);
        order.setShakes(shakes);
        order.setSmallDrinks(smallDrink);
        order.setMediumDrinks(mediumDrink);
        order.setLargeDrinks(largeDrink);

        // Let's instantiate the Intent and navigate to SummaryActivity
        Intent intent = new Intent(this, SummaryActivity.class);
        // Put data into Intent
        intent.putExtra("OrderTotal",
                "Order Total: " + currency.format(order.calculateTotal()));
        intent.putExtra("ItemsOrdered",
                "Items Ordered: " + order.getNumberItemsOrdered());
        intent.putExtra("Subtotal",
                "Subtotal: " + currency.format(order.calculateSubtotal()));
        intent.putExtra("Tax",
                "Tax (8%): " + currency.format(order.calculateTax()));
        // Fire off the Intent
        startActivity(intent);
    }
}
