package com.example.admin.trailerhire;

/**
 * Created by admin on 2017/10/06.
 */

public class Pay {

    private double ratePerHour = 28.50;
    private int hour;
    private double rate;

    public Pay(int hour, double rate) {
        this.hour = hour;
        this.rate = rate;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calculatePay(){

        double totalPay = 0.00;
        if (hour == 40 && rate < ratePerHour){
            totalPay = hour * (ratePerHour + 1.50);

        }
        if(hour == 40 && rate >= ratePerHour){
            totalPay = hour * (ratePerHour + 1.20);

        }
        if(hour > 40 && rate >= ratePerHour){
            double newRatePerHour = ratePerHour * 0.105;
            totalPay = hour * (ratePerHour + newRatePerHour);

        }
        if(hour < 40 && rate >= ratePerHour){

            totalPay = hour * (ratePerHour - 0.05);


        }
        return totalPay;

    }
}
