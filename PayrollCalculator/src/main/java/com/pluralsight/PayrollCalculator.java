package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter hours worked: ");
        float hoursWorked = scanner.nextFloat();

        System.out.println("enter your pay rate");
        float payRate = scanner.nextFloat();

        float grossPay = hoursWorked * payRate;

        System.out.printf("Employee; %s\n", name);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);





    }
}
