package edu.miracosta.cs134.kelias.inandout.model;

/**
 * Calculates the total cost of a food order
 * using the item quantity input from user.
 */
public class Order {
    // Constants
    public static final double PRICE_DOUBLE_DOUBLE = 3.60;
    public static final double PRICE_CHEESEBURGER = 2.15;
    public static final double PRICE_FRENCH_FRIES = 1.65;
    public static final double PRICE_SHAKE = 2.20;
    public static final double PRICE_SMALL_DRINK = 1.45;
    public static final double PRICE_MEDIUM_DRINK = 1.55;
    public static final double PRICE_LARGE_DRINK = 1.75;
    public static final double TAX_RATE = 0.08;

    // Instance variables
    private int mDoubleDoubles;
    private int mCheeseburgers;
    private int mFrenchFries;
    private int mShakes;
    private int mSmallDrinks;
    private int mMediumDrinks;
    private int mLargeDrinks;

    /** Constructor
     * Sets all food item quantities to 0
     */
    public Order() {
        mDoubleDoubles = 0;
        mCheeseburgers = 0;
        mFrenchFries = 0;
        mShakes = 0;
        mSmallDrinks = 0;
        mMediumDrinks = 0;
        mLargeDrinks = 0;
    }

    // getters/setters

    /**
     * Accessor/Getter for amount of double-double burgers
     * @return mDoubleDoubles   amount of double-double burgers
     */
    public int getDoubleDoubles() {
        return mDoubleDoubles;
    }

    /**
     * Mutator/Setter for amount of double-double burgers
     * @param doubleDoubles   amount of double-double burgers
     */
    public void setDoubleDoubles(int doubleDoubles) {
        mDoubleDoubles = doubleDoubles;
    }

    /**
     * Accessor/Getter for amount of cheeseburgers
     * @return mCheeseburgers   amount of cheeseburgers
     */
    public int getCheeseburgers() {
        return mCheeseburgers;
    }

    /**
     * Mutator/Setter for amount of cheeseburgers
     * @param cheeseburgers   amount of cheeseburgers
     */
    public void setCheeseburgers(int cheeseburgers) {
        mCheeseburgers = cheeseburgers;
    }

    /**
     * Accessor/Getter for amount of french fries
     * @return mFrenchFries   amount of french fries
     */
    public int getFrenchFries() {
        return mFrenchFries;
    }

    /**
     * Mutator/Setter for amount of french fries
     * @param frenchFries   amount of french fries
     */
    public void setFrenchFries(int frenchFries) {
        mFrenchFries = frenchFries;
    }

    /**
     * Accessor/Getter for amount of shakes
     * @return mShakes   amount of shakes
     */
    public int getShakes() {
        return mShakes;
    }

    /**
     * Mutator/Setter for amount of shakes
     * @param shakes   amount of shakes
     */
    public void setShakes(int shakes) {
        mShakes = shakes;
    }

    /**
     * Accessor/Getter for amount of small fountain drinks
     * @return mSmallDrinks   amount of small fountain drinks
     */
    public int getSmallDrinks() {
        return mSmallDrinks;
    }

    /**
     * Mutator/Setter for amount of small fountain drinks
     * @param smallDrinks   amount of small fountain drinks
     */
    public void setSmallDrinks(int smallDrinks) {
        mSmallDrinks = smallDrinks;
    }

    /**
     * Accessor/Getter for amount of medium fountain drinks
     * @return mMediumDrinks   amount of medium fountain drinks
     */
    public int getMediumDrinks() {
        return mMediumDrinks;
    }

    /**
     * Mutator/Setter for amount of medium fountain drinks
     * @param mediumDrinks   amount of medium fountain drinks
     */
    public void setMediumDrinks(int mediumDrinks) {
        mMediumDrinks = mediumDrinks;
    }

    /**
     * Accessor/Getter for amount of large fountain drinks
     * @return mLargeDrinks   amount of large fountain drinks
     */
    public int getLargeDrinks() {
        return mLargeDrinks;
    }

    /**
     * Mutator/Setter for amount of large fountain drinks
     * @param largeDrinks   amount of large fountain drinks
     */
    public void setLargeDrinks(int largeDrinks) {
        mLargeDrinks = largeDrinks;
    }

    /**
     * Adds up all the food items in current placed order
     * @return  total number of food items in order
     */
    public int getNumberItemsOrdered(){
        return getDoubleDoubles() + getCheeseburgers() + getFrenchFries()
                + getShakes() + getSmallDrinks() + getMediumDrinks()
                + getLargeDrinks();
    }

    /**
     * Calculates the cost of all food items in current placed order
     * @return  dollar amount of all ordered food items
     */
    public double calculateSubtotal() {
        return (getDoubleDoubles() * PRICE_DOUBLE_DOUBLE)
                + (getCheeseburgers() * PRICE_CHEESEBURGER)
                + (getFrenchFries() * PRICE_FRENCH_FRIES)
                + (getShakes() * PRICE_SHAKE)
                + (getSmallDrinks() * PRICE_SMALL_DRINK)
                + (getMediumDrinks() * PRICE_MEDIUM_DRINK)
                + (getLargeDrinks() * PRICE_LARGE_DRINK);
    }

    /**
     * Calculates the taxes to be added from subtotal
     * @return  dollar amount of taxes
     */
    public double calculateTax() {
        return calculateSubtotal() * TAX_RATE;
    }

    /**
     * Calculates the total cost for the placed order
     * @return  dollar amount of completed order
     */
    public double calculateTotal() {
        return calculateSubtotal() + calculateTax();
    }
}
