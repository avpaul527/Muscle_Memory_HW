package Chapter6;

import java.sql.SQLOutput;

public class PhoneBill {
    private int id;
    private static int idCount;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    public PhoneBill() {};

    public PhoneBill(int id) {
        this.id = id;
        idCount++;
        id = idCount;
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed) {
        this.id = id;
        idCount++;
        id = idCount;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverage() {
        if (minutesUsed > allottedMinutes) {
            int extraMinutes = minutesUsed - allottedMinutes;
            double perMinute = 0.15;
            return extraMinutes * perMinute;
        }else {
            return 0;
        }
    }


    public double calculateTax() {
        double taxAmt = 0.10;
        return (baseCost + calculateOverage()) * taxAmt;
    }

    public double calculateTotal() {
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printItemizedBill() {

        System.out.println("Hello! Here is your phone bill: \n" + "Phone ID: " + this.id + "\n Base Cost: " + baseCost + "\n Overage: " + calculateOverage() + "\n Tax: " + calculateTax() + "\n Your total is: $ " + calculateTotal());
    }
}