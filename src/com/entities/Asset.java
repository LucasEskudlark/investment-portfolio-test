package com.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Asset {
    private String assetCode;
    private int amount;
    private double pricePerUnity;
    private Date purchaseDate;

    public Asset() {
    }

    // Constructor
    public Asset(String assetCode, int amount, double pricePerUnity, Date purchaseDate) {
        this.assetCode = assetCode;
        this.amount = amount;
        this.pricePerUnity = pricePerUnity;
        this.purchaseDate = purchaseDate;
    }

    // Getters and setters
    public String getAssetCode() {
        return assetCode;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Double getPricePerUnity() {
        return pricePerUnity;
    }

    public void setPricePerUnity(double pricePerUnity) {
        this.pricePerUnity = pricePerUnity;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    // Method to return the total amount invested in an asset
    public double getTotalInvested() {
        return this.amount * this.pricePerUnity;
    }

    // toString method
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return  "Asset = " + assetCode +
                "| Amount = " + amount +
                "| Price per unity = U$" + pricePerUnity +
                "| Purchased in = " + sdf.format(purchaseDate) +
                "| Amount invested = U$" + this.amount * this.pricePerUnity;
    }
}
