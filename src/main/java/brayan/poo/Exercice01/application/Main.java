package brayan.poo.Exercice01.application;

import brayan.poo.Exercice01.domain.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Samsung Desktop i5 8th gen", 500.00, 0);

        System.out.println("==========================");
        System.out.println("WELCOME TO STOCK CONTROL");

        Scanner scanner = new Scanner(System.in);
        char continues = 'Y';

        do {
            System.out.println("==========================");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Total Value In Stock");
            System.out.println("4. Show Product Information");
            System.out.println("0. Quit");
            System.out.print("Choice one Option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Quantity: ");
                    int addQuantity = scanner.nextInt();
                    try {
                        product.addInStock(addQuantity);
                        System.out.println("Stock updated successfully");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Quantity: ");
                    int removeQuantity = scanner.nextInt();
                    try {
                        product.removeInStock(removeQuantity);
                        System.out.println("Stock updated successfully");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    double totalValueInStock = product.calculateTotalValueInStock();
                    System.out.println(totalValueInStock);
                    break;

                case 4:
                    System.out.println(product);
                    break;

                case 0:
                    System.out.println("Thanks for the time");
                    return;

                default:
                    System.out.println("Invalid Option. Please choice valid option");
                    break;
            }

            System.out.println("Wishes to Continue? (Y/N)");
            choice = scanner.next().toUpperCase().charAt(0);
            if (choice == 'N') {
                return;
            }
        } while (continues == 'Y');

    }
}
