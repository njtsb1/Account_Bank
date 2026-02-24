package com.accountbank;

import java.util.Scanner;

/**
 * Main class for the Account Bank application
 * Reads account data from the terminal and displays a confirmation message.
 */
public class AccountTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the Account number!");
        int accountNumber = 0;
        while (true) {
            try {
                System.out.print("> ");
                accountNumber = Integer.parseInt(scanner.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter an integer for the Account number.");
            }
        }

        System.out.println("Please enter the Agency number!");
        System.out.print("> ");
        String agency = scanner.nextLine().trim();

        System.out.println("Please enter the Client Name!");
        System.out.print("> ");
        String clientName = scanner.nextLine().trim();

        System.out.println("Please enter the Balance!");
        double balance = 0.0;
        while (true) {
            try {
                System.out.print("> ");
                String input = scanner.nextLine().trim().replace(",", ".");
                balance = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a decimal number for the Balance (e.g., 237.48).");
            }
        }

        String message = "Hello ".concat(clientName)
                .concat(", thank you for opening an account with our bank; your agency is ")
                .concat(agency)
                .concat(", account ")
                .concat(String.valueOf(accountNumber))
                .concat(" and your balance ")
                .concat(String.format("%.2f", balance))
                .concat(" is now available for withdrawal.");

        System.out.println();
        System.out.println(message);

        scanner.close();
    }
}
