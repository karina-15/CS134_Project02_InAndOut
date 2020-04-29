# CS134_Project02_InAndOut
Android app using multiple Activities and Intent

## Screenshot
**Order Activity**
<img src="./screenshots/order-activity-screenshot.png" height="550">
**Summary Activity**
<img src="./screenshots/summary-activity-screenshot.png" height="550">

## Instructions
As our first project using multiple Activities and Intents, we will be implementing an app to place orders at the fictional
"In And Out Burger"  (actual company is named In-N-Out)

**Order Activity shown below (activity_order.xml)**

We will be utilizing a TableLayout to group all of the Views presented in the OrderActivity together.  

When the user clicks the placeOrderButton, all the input from each control should be read and set within the model (Order.java).
An Intent will be created that sends the necessary information to a second activity called SummaryActivity.  Below is a sample
transaction showing the flow of information from OrderActivity to SummaryActivity:

**Order.java model class diagram**

**Tasks to Accomplish in the OrderActivity.java Controller:**
Add an onClick event for the placeOrderButton which reads each of the EditText controls and initializes an Order model with the user input.
Create the Intent object needed to pass information to the SummaryActivity.
Start the SummaryActivity
 

Tasks to Accomplish in the SummaryActivity.java Controller:

In the onCreate method, read the data from the Intent and populate the corresponding TextViews.
Add an onClick event for the startNewOrderButton that finishes the SummaryActivity.
