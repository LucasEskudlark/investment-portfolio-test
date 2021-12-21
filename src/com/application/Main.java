package com.application;

import com.entities.Asset;
import com.entities.Portfolio;

import java.util.Date;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Asset asset;
        Portfolio portfolio = new Portfolio();

        while (true){
            int option = menu("Add asset", "Invested assets", "Sell asset", "Portfolio report", "Exit");

            // If option == 1 | Add asset
            if (option == 1) {
                // Request asset code
                System.out.print("Enter asset code: ");
                String assetCode = sc.next();
                int a = assetCode.length();
                // Asset code error | Asset code != 4
                while (a != 4) {
                    System.out.println("Error! Try again.");
                    System.out.print("Enter asset code: ");
                    assetCode = sc.nextLine();
                    a = assetCode.length();
                }

                // Request amount
                System.out.print("Enter amount: " );
                int amount = sc.nextInt();
                // Amount error | Amount < 1
                while (amount < 1) {
                    System.out.println("Error! Try again.");
                    System.out.print("Enter amount: " );
                    amount = sc.nextInt();
                }

                // Request price per unity
                System.out.print("Enter price per unity: U$");
                double pricePerUnity = sc.nextDouble();
                // Price per unity error | Price <= 0
                while (pricePerUnity <= 0){
                    System.out.println("Error! Try again.");
                    System.out.print("Enter price per unity: U$");
                    pricePerUnity = sc.nextDouble();
                }

                // Set the current date
                Date date = new Date();
                // Create Asset object
                asset = new Asset(assetCode, amount, pricePerUnity, date);

                // Add asset to portfolio
                portfolio.addAsset(asset);
            }


            // If option == 2 | Invested assets
            if (option == 2){
                portfolio.investedAssets();
            }

            // If option == 3 | Sell asset
            if (option == 3){
                sc.nextLine();
                System.out.print("Enter the code of the asset: ");
                String code = sc.nextLine();

                portfolio.sellAsset(code);
            }

            // If option == 4 | Portfolio report
            if (option == 4) {
                portfolio.assetReport();
            }

            // If option == 5 | Exit
            if (option == 5) {
                break;
            }
        }
    }

    /* Interactive menu method
     * It receives String options and creates a menu requesting the option chosen by the user*/
    public static int menu(String... options) {
        Scanner sc = new Scanner(System.in);
        int c = 1;

        System.out.println();
        System.out.println("------- Options -------");
        for (String option: options) {
            System.out.println("[" + c + "] " + option);
            c++;
        }
        System.out.print("Enter your option: ");

        return sc.nextInt();
    }
}
