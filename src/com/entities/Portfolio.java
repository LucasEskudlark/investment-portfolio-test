package com.entities;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    // Composition with "Asset" class
    private List<Asset> assets = new ArrayList<>();

    // Method to add assets to the list
    public void addAsset(Asset asset) {
        assets.add(asset);
    }

    // Method to remove assets from the list
    public void removeAsset(Asset asset){
        assets.remove(asset);
    }

    // Method to make the portfolio report
    public void assetReport(){
        int sum = 0;

        // Sum all the money invested (All assets) and show the results
        for (Asset a: assets) {
            sum += a.totalInvested();
        }
        System.out.println("Total amount invested: U$: " + sum);

        // Show all the assets in the portfolio
        System.out.println("Assets: ");
        for (Asset a: assets) {
            System.out.println(a);
        }
    }
}
