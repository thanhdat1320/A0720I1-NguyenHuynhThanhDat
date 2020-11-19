package furama_resort.views;

import furama_resort.commons.FuncFileCSV;
import furama_resort.models.Employee;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ProfileEmployee {
    static Scanner sc = new Scanner(System.in);
    static Map<String, Employee> employeeMap = new LinkedHashMap<>();
    static Stack<Employee> employeeStack = new Stack<>();

    private static void displayMainMenu() {
        System.out.println("1. Display Profile Employee\n" +
                "2. Find Profile Employee\n" +
                "3. Back To Menu");
        System.out.print("Your Choose: ");
        String choose = sc.nextLine();
        switch (choose) {
            case "1": {
                displayProfile();
                break;
            }
            case "2": {
                System.out.print("Enter name to find: ");
                String name = sc.nextLine();
                findProfile(name);
                break;
            }
            default: {
                System.out.println("Fail!!! Please choose again");
                sc.nextLine();
                displayMainMenu();
            }
        }
    }

    private static void displayProfile() {
        for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
            System.out.println(entry);
        }
        displayMainMenu();
    }

    private static void findProfile(String name) {
        for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
            employeeStack.add(entry.getValue());
        }
        for (Employee employee : employeeStack) {
            if (name.equals(employee.getName())) {
                System.out.println(employee.toString());
            } else {
                System.out.println("Don't have");
            }
            break;
        }
        displayMainMenu();
    }


    public static void main(String[] args) {
        employeeMap = FuncFileCSV.readFileEmployee();
        displayMainMenu();
    }
}

