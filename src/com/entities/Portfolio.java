package com.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Portfolio {
    // Composition with "Asset" class
    private List<Asset> assets = new ArrayList<>();

    // Method to add assets to the list
    public void addAsset(Asset asset) {
        assets.add(asset);
    }

    // Method to sell assets
    public void sellAsset(String assetCode){
        Scanner sc = new Scanner(System.in);
        int c = 0;

        for (Asset a: assets) {
            if (Objects.equals(a.getAssetCode(), assetCode)) {
                c += 1;
                // Request the amount to be sold
                System.out.print("Enter the amount you want to sell: ");
                int amount = sc.nextInt();

                // Error if amount < 0 or amount > invested amount
                if (amount < 1 || amount > a.getAmount()){
                    System.out.println("Invalid amount");
                } else{
                    // If only part of the total amount is going to be sold, set new amount
                    a.setAmount(a.getAmount() - amount);
                }

            } else {
                // Error if the code entered doesn't match any asset
                if (c == 0){
                    System.out.println("Asset not found");
                }
            }

        }
    }

    // Method to show invested assets
    public void investedAssets(){
        for (Asset a: assets) {
            System.out.println(a);
        }
    }

    // Method to make the portfolio report
    public void assetReport(){
        int sum = 0;

        if (assets.size() != 0){
            // Show all the assets in the portfolio
            System.out.println("Assets: ");
            for (Asset a: assets) {
                System.out.println(a);
            }

            // Sum all the money invested (All assets) and show the results
            for (Asset a: assets) {
                sum += a.getTotalInvested();
            }
            System.out.println("------------------------------------------------------");
            System.out.println("Total amount invested: U$: " + sum);
        } else {
            System.out.println("You don't have any invested assets yet");
        }

    }
}
