package furama_resort.controllers;

import furama_resort.commons.FuncFileCSV;
import furama_resort.models.House;
import furama_resort.models.Room;
import furama_resort.models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    static Scanner input = new Scanner(System.in);
    static List<Villa> villaList = new ArrayList<>();
    static List<House> houseList = new ArrayList<>();
    static List<Room> roomList = new ArrayList<>();

    public static void displayMainMenu() {
        System.out.println("=========== MAIN MENU ===========");
        System.out.println("1. Add New Services");
        System.out.println("2. Show Services");
        System.out.println("3. Add New Customer");
        System.out.println("4. Show Customer");
        System.out.println("5. Add New Booking");
        System.out.println("6. Show Information Of Employee");
        System.out.println("7. Exit");
        System.out.println("=================================");
        System.out.print("Your choose: ");
        String choose = input.nextLine();

        switch (choose) {
            case "1": {
                addNewServices();
                break;
            }
            case "2": {
                showServices();
                break;
            }
            case "3": {
                addNewCustomer();
                break;
            }
            case "4": {
                showCustomer();
                break;
            }
            case "5": {
                addNewBooking();
                break;
            }
            case "6": {
                showInformationOfEmployee();
                break;
            }
            case "7": {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Fail! Please choose again! Enter to continue.");
                input.nextLine();
                displayMainMenu();
            }
        }
    }

    public static void addNewServices() {
        System.out.println("========== ADD NEW SERVICES ==========");
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back to menu");
        System.out.println("5. Exit");
        System.out.println("======================================");
        System.out.print("Your choose: ");
        String choose = input.nextLine();

        switch (choose) {
            case "1": {
                addNewVilla();
                break;
            }
            case "2": {
                addNewHouse();
                break;
            }
            case "3": {
                addNewRoom();
                break;
            }
            case "4": {
                displayMainMenu();
                break;
            }
            case "5": {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Fail!!! Please Choose again! Enter to continue.");
                input.nextLine();
                addNewServices();
            }
        }
    }

    public static void  addNewVilla() {
//        villaList = FuncFileCSV.readFileToListVilla();
        Villa villa = new Villa();

        System.out.print("Standard Room: ");
        villa.setStandardRoom(input.nextLine());
        System.out.print("Area Pool: ");
        villa.setAreaPool(input.nextLine());
        System.out.print("Floor: ");
        villa.setFloor(input.nextLine());
        System.out.print("Other Facilities: ");
        villa.setOtherFacilities(input.nextLine());
        villaList.add(villa);

        System.out.println("\nAdd new Villa completed!\n");
        FuncFileCSV.writeVillaToFileCSV(villaList, "villa");
        addNewServices();
    }

    public static void addNewHouse() {
        House house = new House();

        System.out.print("Standard Room: ");
        house.setStandardRoom(input.nextLine());
        System.out.print("Floor: ");
        house.setFloor(input.nextLine());
        System.out.print("Other Facilities: ");
        house.setOtherFacilities(input.nextLine());
        houseList.add(house);

        System.out.println("\nAdd new House completed!\n");
        FuncFileCSV.writeVillaToFileCSV(houseList, "house");
        addNewServices();
    }

    public static void addNewRoom() {
        Room room = new Room();

        System.out.print("Free Service: ");
        room.setFreeService(input.nextLine());

        roomList.add(room);

        System.out.println("\nAdd new Room completed!\n");
        FuncFileCSV.writeVillaToFileCSV(roomList, "room");
        addNewServices();
    }

    public static void showServices() {
        System.out.println("========== SHOW SERVICES ==========");
        System.out.println("1.Show all Villa");
        System.out.println("2.Show all House");
        System.out.println("3.Show all Room");
        System.out.println("4.Show All Name Villa Not Duplicate");
        System.out.println("5.Show All Name House Not Duplicate");
        System.out.println("6.Show All Name Room Not Duplicate");
        System.out.println("7.Back To Menu");
        System.out.println("8.Exit");
        System.out.println("===================================");
        System.out.print("Your choose: ");
        String choose = input.nextLine();

        switch (choose) {
            case "1": {
                showAllVilla();
                break;
            }
            case "2": {
                showAllHouse();
                break;
            }
            case "3": {
                showAllRoom();
                break;
            }
            case "4": {
                showNameVilla();
            }
            case "5": {
                showNameHouse();
                break;
            }
            case "6": {
                showNameRoom();
                break;
            }
            case "7": {
                displayMainMenu();
                break;
            }
            case "8": {
                System.exit(0);
                break;

            }
            default: {
                System.out.println("Fail!!! Please Choose again! Enter to continue.");
                input.nextLine();
                showServices();
            }
        }
    }

    public static void showAllVilla() {
    }

    public static void showAllHouse() {
    }

    public static void showAllRoom() {
    }

    public static void showNameVilla() {
    }

    public static void showNameHouse() {
    }

    public static void showNameRoom() {
    }


    public static void addNewCustomer() {
    }

    public static void showCustomer() {
    }

    public static void addNewBooking() {
    }

    public static void showInformationOfEmployee() {
    }

    public static void main(String[] args) {
        displayMainMenu();
    }


}

