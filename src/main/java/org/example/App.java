/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        final float WI_TAX = 0.055f;
        float subtotal;
        String state;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the order amount?");
        subtotal = scanner.nextFloat();

        System.out.println("What is the state?");
        scanner.nextLine();
        state = scanner.nextLine();

        scanner.close();

        if(!state.equalsIgnoreCase("wi"))
        {
            System.out.printf("The total is $%.2f", subtotal);
            return;
        }

        System.out.printf("The subtotal is %.2f\nThe tax is $%.2f\nThe total is $%.2f.", subtotal, subtotal * WI_TAX, subtotal + (subtotal * WI_TAX));
    }
}
