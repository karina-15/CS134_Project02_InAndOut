package edu.miracosta.cs134.kelias.inandout.model;

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

    // Constructor
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

    public int getDoubleDoubles() {
        return mDoubleDoubles;
    }

    public void setDoubleDoubles(int doubleDoubles) {
        mDoubleDoubles = doubleDoubles;
    }

    public int getCheeseburgers() {
        return mCheeseburgers;
    }

    public void setCheeseburgers(int cheeseburgers) {
        mCheeseburgers = cheeseburgers;
    }

    public int getFrenchFries() {
        return mFrenchFries;
    }

    public void setFrenchFries(int frenchFries) {
        mFrenchFries = frenchFries;
    }

    public int getShakes() {
        return mShakes;
    }

    public void setShakes(int shakes) {
        mShakes = shakes;
    }

    public int getSmallDrinks() {
        return mSmallDrinks;
    }

    public void setSmallDrinks(int smallDrinks) {
        mSmallDrinks = smallDrinks;
    }

    public int getMediumDrinks() {
        return mMediumDrinks;
    }

    public void setMediumDrinks(int mediumDrinks) {
        mMediumDrinks = mediumDrinks;
    }

    public int getLargeDrinks() {
        return mLargeDrinks;
    }

    public void setLargeDrinks(int largeDrinks) {
        mLargeDrinks = largeDrinks;
    }

    public int getNumberItemsOrdered(){
        return getDoubleDoubles() + getCheeseburgers() + getFrenchFries()
                + getShakes() + getSmallDrinks() + getMediumDrinks()
                + getLargeDrinks();
    }

    public double calculateSubtotal() {
        return (getDoubleDoubles() * PRICE_DOUBLE_DOUBLE)
                + (getCheeseburgers() * PRICE_CHEESEBURGER)
                + (getFrenchFries() * PRICE_FRENCH_FRIES)
                + (getShakes() * PRICE_SHAKE)
                + (getSmallDrinks() * PRICE_SMALL_DRINK)
                + (getMediumDrinks() * PRICE_MEDIUM_DRINK)
                + (getLargeDrinks() * PRICE_LARGE_DRINK);
    }

    public double calculateTax() {
        return calculateSubtotal() * TAX_RATE;
    }

    public double calculateTotal() {
        return calculateSubtotal() + calculateTax();
    }
}
