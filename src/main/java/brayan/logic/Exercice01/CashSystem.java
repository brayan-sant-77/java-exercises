package brayan.logic.Exercice01;

import java.util.Scanner;

public class CashSystem {
    private double balance = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        CashSystem cashSystem = new CashSystem();

        do {
            // exibir o menu
            System.out.println("=== CASH SYSTEM ===");
            System.out.println("1. Add Cash");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Consult Balance");
            System.out.println("0. Exit");
            System.out.println("----------------");
            System.out.print("Choose: ");

            // validação de entrada (evita crash se digitar letras)
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("How much do you want to add: ");
                        double add = scanner.nextDouble();
                        if (cashSystem.addCash(add)) {
                            System.out.println("Operation successfully completed");
                        } else {
                            System.out.println("Invalid amount");
                        }
                        break;

                    case 2:
                        System.out.print("How much you want to withdraw: ");
                        double withdraw = scanner.nextDouble();
                        if (cashSystem.withdrawCash(withdraw)) {
                            System.out.println("Withdraw completed successfully");
                        } else {
                            System.out.println("Insufficient balance");
                        }
                        break;

                    case 3:
                        System.out.println("Balance: " + cashSystem.getBalance());
                        break;

                    case 0:
                        System.out.println("Goodbye!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid option, try again");
                        break;
                }
            } else {
                System.out.println("Invalid input, enter a number!");
                scanner.next(); // limpa o buffer de entrada incorreta
                option = 0;
            }

        } while (option != 0); // continua enquanto não escolher a opção de sair

    }

    private boolean addCash(double cash) {
        if (cash <= 0) {
            return false;
        }
        balance += cash;
        return true;

    }

    private boolean withdrawCash(double drawCash) {
        if (drawCash > balance || drawCash <= 0) {
            return false;
        }
        balance -= drawCash;
        return true;
    }

    private double getBalance() {
        return balance;
    }
}

