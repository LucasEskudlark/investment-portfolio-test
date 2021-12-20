package com.wallet;

public class Asset {
    private String assetCode;
    private Integer amount;
    private Double pricePerUnity;

    // Constructor
    public Asset(String assetCode, Integer amount, Double pricePerUnity){
        this.assetCode = assetCode;
        this.amount = amount;
        this.pricePerUnity = pricePerUnity;
    }


    public String getAssetCode() {
        return assetCode;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getPricePerUnity() {
        return pricePerUnity;
    }

    public void setPricePerUnity(Double pricePerUnity) {
        this.pricePerUnity = pricePerUnity;
    }

    // toString method
    @Override
    public String toString() {
        return "Asset{" +
                "assetCode='" + assetCode + '\'' +
                ", amount=" + amount +
                ", pricePerUnity=" + pricePerUnity +
                '}';
    }
}
