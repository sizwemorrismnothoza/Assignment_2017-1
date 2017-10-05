package com.example.admin.trailerhire;

/**
 * Created by admin on 2017/10/04.
 */

public class Hire {

    private final double basicCost = 300;
    private final double surcharge = 0.05;
    private final double discount = 0.11;
    private int amount;
    private int kiloMeters;
    private double totalCost = 0.00;

    public Hire(int amount, int kiloMeters) {
        this.amount = amount;
        this.kiloMeters = kiloMeters;

    }

    public int getKiloMeters() {
        return kiloMeters;
    }

    public void setKiloMeters(int kiloMeters) {
        this.kiloMeters = kiloMeters;
    }


    public double getTotalCost() {
        double amountDue = kiloMeters * amount;
        totalCost =basicCost + amountDue;

        if( kiloMeters < 40){
            totalCost += amountDue*surcharge;
            return totalCost;
        }
        if(kiloMeters > 200){

        }
       return 0;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }


    public double getBasicCost() {
        return basicCost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


}
