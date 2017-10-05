package com.example.admin.trailerhire;

public class Hire {

    private final double basicCost = 300.00;
    private final double surcharge = 0.05;
    private final double discount = 0.11;
    private int amount;
    private int kiloMeters;
    private double totalCost = 0.00;

    public Hire() {

    }

    public Hire(int amount, int kiloMeters) {
        this.amount = amount;
        this.kiloMeters = kiloMeters;

    }

    public double getBasicCost() {
        return basicCost;
    }
    public double getTotalCost() {
        double amountDue = kiloMeters * amount;
        totalCost =basicCost + amountDue;

        if( kiloMeters < 40){
            totalCost += amountDue*surcharge;
            return totalCost;
        }
        if(kiloMeters > 200){
            totalCost -= amountDue*discount;
            return totalCost;
        }
       return totalCost;
    }


}
