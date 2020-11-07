package controllers;

import java.util.Scanner;

public class MainController {

    public void displayMainMenu() {

        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();

        System.out.println("=========== MAIN MENU ===========");
        System.out.println("1. Add New Services");
        System.out.println("2. Show Services");
        System.out.println("3. Add New Customer");
        System.out.println("4. Show Customer");
        System.out.println("5. Add New Booking");
        System.out.println("6. Show Information Of Employee");
        System.out.println("7. Exit");

        switch (choose) {
            case 1: {
                addNewServices();
            }
        }
    }

    public void addNewServices() {

    }

    public void showServices() {

    }

    public void addNewCustomer() {

    }

    public void showCustomer() {

    }

    public void addNewBooking() {

    }

    public void showInformationOfEmployee() {

    }

}
