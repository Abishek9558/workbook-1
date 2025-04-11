package com.pluralsight;
import java.util.Scanner;
public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Regular ($5.45)");
        System.out.println("2: Large ($8.95)");
        System.out.print("sandwich size (1 or 2):");
        int size = scanner.nextInt();
        double basePrice = 0.0;
        double loadedPrice = 0.0;

        if (size == 1){ basePrice = 5.45;
            loadedPrice = 1.00;
        }
        else if (size == 2) { basePrice = 8.95;
            loadedPrice = 1.75;
        }
        System.out.print("you wanna load your sandwich? (yes/no): ");
        scanner.nextLine();
        String loadedChoice = scanner.nextLine();

        if (loadedChoice.equals("yes")){basePrice += loadedPrice;}
        else if (loadedChoice.equals("no")) {
            System.out.println("NO loaded option.");

        }


        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        double discount = 0.0;
        if (age <=17) {discount = 0.10;}
        else if (age >=65) { discount =0.20;}

        double finalPrice = basePrice - (basePrice * discount);
        System.out.printf("sandwich costs: $%.2f%n", finalPrice);
        scanner.close();


    }
}
