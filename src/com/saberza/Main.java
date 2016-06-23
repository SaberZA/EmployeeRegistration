package com.saberza;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please choose an option(-1 to exit): ");
        int choice = 0;

        Scanner scanner = new Scanner(System.in);

        while(choice >= 0)
        {
            createMenu();
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    addEmployee();break;
                case 2:
                    removeEmployee();break;
                case 3:
                    updateEmployee();break;
                default:
                    exitMenu();return;
            }
        }
    }

    private static void exitMenu() {
        System.out.println("Exiting...");
    }

    private static void updateEmployee() {
        System.out.println("Update Employee Steven");
    }

    private static void removeEmployee() {
        System.out.println("Remove Employee Steven");
    }

    private static void addEmployee() {
        System.out.println("Adding employee Steven");

    }

    private static void createMenu()
    {
        System.out.println("1: Add Employee");
        System.out.println("2: Remove Employee");
        System.out.println("3: Update Employee");
    }
}
