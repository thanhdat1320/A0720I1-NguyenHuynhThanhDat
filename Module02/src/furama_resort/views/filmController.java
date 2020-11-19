package furama_resort.views;

import furama_resort.commons.FuncFileCSV;
import furama_resort.models.Customer;
import furama_resort.models.Services;

import java.util.*;

public class filmController {

    static Scanner sc = new Scanner(System.in);

    static Queue<Customer> ListCustomerBuy = new LinkedList<>();
    static List<Customer> listCustomer = new ArrayList<>();

    static int numberTicket = 2;

    private static void displayMainMenu() {
        System.out.println("1. Buy ticket\n" +
                "2. Display number chair\n" +
                "3. Back to menu\n" +
                "4. Exit");
        System.out.print("Your choose: ");
        String choose = sc.nextLine();

        switch (choose) {
            case "1": {
                buyTicket();
                displayMainMenu();
                break;
            }
            case "2": {
                displayNumber();
                displayMainMenu();
                break;
            }
            default: {
                System.out.println("Fail! Please choose again");
                sc.nextLine();
                displayMainMenu();
            }
        }
    }

    private static void buyTicket() {
        if (numberTicket == 0) {
            System.out.println("Sold Out");
        }
        for (Customer customer : listCustomer) {
            System.out.println((listCustomer.indexOf(customer) + 1 + ". ") + customer.showInfo() + "\n");
        }
        System.out.print("Enter Customer To Buy Ticket: ");
        String choose = sc.nextLine();
        int index = Integer.parseInt(choose) - 1;
        ListCustomerBuy.add(listCustomer.get(index));
        numberTicket--;
        System.out.println("Remaining tickets is: " + numberTicket);
        displayMainMenu();
    }

    private static void displayNumber() {
        int numberChair = 1;
        for (Customer customer : ListCustomerBuy) {
            System.out.println("Your chair: " + numberChair);
            System.out.println(customer.showInfo());
        }
        displayMainMenu();
    }

    public static void main(String[] args) {
        List<Services> villaList = FuncFileCSV.readServicesFileCSV("villa");
        listCustomer = FuncFileCSV.readFileCustomer(villaList, "SVVL");
        displayMainMenu();
    }
}
