package furama_resort.controllers;

import furama_resort.commons.FuncFileCSV;
import furama_resort.models.House;
import furama_resort.models.Room;
import furama_resort.models.Services;
import furama_resort.models.Villa;

import java.util.*;
import java.util.regex.Pattern;

public class MainController {
    static Scanner input = new Scanner(System.in);
    static List<Services> villaList = new ArrayList<>();
    static List<Services> houseList = new ArrayList<>();
    static List<Services> roomList = new ArrayList<>();
    static Set<String> nameVillaNotDuplicate = new TreeSet<>();
    static Set<String> nameHouseNotDuplicate = new TreeSet<>();
    static Set<String> nameRoomNotDuplicate = new TreeSet<>();

    private static Villa villa = new Villa();
    private static House house = new House();
    private static Room room = new Room();

    private static final Pattern REGEX_ID_VILLA = Pattern.compile("[S][V][V][L][-]\\d{4}");
    private static final Pattern REGEX_ID_HOUSE = Pattern.compile("[S][V][H][O][-]\\d{4}");
    private static final Pattern REGEX_ID_ROOM = Pattern.compile("[S][V][R][O][-]\\d{4}");
    private static final Pattern REGEX_NAME_TYPE_RENTS_STANDARD = Pattern.compile("([A-Z])\\w+");

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

    public static void addNewVilla() {
        villaList = FuncFileCSV.readFileCSV("villa");

        checkName("villa");
        checkID("villa");
        checkAreaAndPool("villa");
        checkAmount("villa");
        checkPrice("villa");
        checkTypeRents("villa");
        checkStandard("villa");
        checkAreaAndPool("villa");
        checkFloor("villa");

        System.out.print("Other Facilities: ");
        villa.setOtherFacilities(input.nextLine());
        villaList.add(villa);

        System.out.println("\nAdd new Villa completed!\n");
        FuncFileCSV.writeFileCSV(villaList, "villa");
        addNewServices();
    }

    public static void addNewHouse() {
        houseList = FuncFileCSV.readFileCSV("house");

        checkName("house");
        checkID("house");
        checkAreaAndPool("house");
        checkAmount("house");
        checkPrice("house");
        checkTypeRents("house");
        checkStandard("house");
        checkFloor("house");

        System.out.print("Other Facilities: ");
        house.setOtherFacilities(input.nextLine());
        houseList.add(house);

        System.out.println("\nAdd new House completed!\n");
        FuncFileCSV.writeFileCSV(houseList, "house");
        addNewServices();
    }

    public static void addNewRoom() {
        roomList = FuncFileCSV.readFileCSV("room");

        checkName("room");
        checkID("room");
        checkAreaAndPool("room");
        checkAmount("room");
        checkPrice("room");
        checkTypeRents("room");

        System.out.print("Free Service: ");
        room.setFreeService(input.nextLine());

        roomList.add(room);

        System.out.println("\nAdd new Room completed!\n");
        FuncFileCSV.writeFileCSV(roomList, "room");
        addNewServices();
    }

    // Check Name
    private static void checkName(String value) {
        while (true) {
            if (value.equals("villa")) {
                System.out.print("Name: ");
                String nameCheck = input.nextLine();
                if (REGEX_NAME_TYPE_RENTS_STANDARD.matcher(nameCheck).matches()) {
                    villa.setName(nameCheck);
                    break;
                }
            } else if (value.equals("house")) {
                System.out.print("Name: ");
                String nameCheck = input.nextLine();
                if (REGEX_NAME_TYPE_RENTS_STANDARD.matcher(nameCheck).matches()) {
                    house.setName(nameCheck);
                    break;
                }
            } else if (value.equals("room")) {
                System.out.print("Name: ");
                String nameCheck = input.nextLine();
                if (REGEX_NAME_TYPE_RENTS_STANDARD.matcher(nameCheck).matches()) {
                    room.setName(nameCheck);
                    break;
                }
            }
        }
    }

    // Check ID
    private static void checkID(String value) {
        while (true) {
            if (value.equals("villa")) {
                System.out.print("ID: ");
                String checkID = input.nextLine();
                if (REGEX_ID_VILLA.matcher(checkID).matches()) {
                    villa.setId(checkID);
                    break;
                }
            } else if (value.equals("house")) {
                System.out.print("ID: ");
                String checkID = input.nextLine();
                if (REGEX_ID_HOUSE.matcher(checkID).matches()) {
                    house.setId(checkID);
                    break;
                }
            } else if (value.equals("room")) {
                System.out.print("ID: ");
                String checkID = input.nextLine();
                if (REGEX_ID_ROOM.matcher(checkID).matches()) {
                    room.setId(checkID);
                    break;
                }
            }
        }
    }

    // Check Area
    private static void checkAreaAndPool(String value) {

        while (true) {
            if (value.equals("villa")) {
                System.out.print("Area: ");
                String area = input.nextLine();
                if (Double.parseDouble(area) > 30) {
                    villa.setArea(area);
                    break;
                }
            } else if (value.equals("house")) {
                System.out.print("Area: ");
                String area = input.nextLine();
                if (Double.parseDouble(area) > 30) {
                    house.setArea(area);
                    break;
                }
            } else if (value.equals("room")) {
                System.out.print("Area: ");
                String area = input.nextLine();
                if (Double.parseDouble(area) > 30) {
                    room.setArea(area);
                    break;
                }
            }
        }
    }

    // Check Amount
    private static void checkAmount(String value) {
        while (true) {
            if (value.equals("villa")) {
                System.out.print("Amount: ");
                String amount = input.nextLine();
                if (Double.parseDouble(amount) > 0 && Double.parseDouble(amount) < 20) {
                    villa.setAmount(amount);
                    break;
                }
            } else if (value.equals("house")) {
                System.out.print("Amount: ");
                String amount = input.nextLine();
                if (Double.parseDouble(amount) > 0 && Double.parseDouble(amount) < 20) {
                    house.setAmount(amount);
                    break;
                }
            } else if (value.equals("room")) {
                System.out.print("Amount: ");
                String amount = input.nextLine();
                if (Double.parseDouble(amount) > 0 && Double.parseDouble(amount) < 20) {
                    room.setAmount(amount);
                    break;
                }
            }
        }
    }

    // Check Price
    private static void checkPrice(String value) {
        while (true) {
            if (value.equals("villa")) {
                System.out.print("Price: ");
                String price = input.nextLine();
                if (Double.parseDouble(price) > 0 || Integer.parseInt(price) > 0) {
                    villa.setPrice(price);
                    break;
                }
            } else if (value.equals("house")) {
                System.out.print("Price: ");
                String price = input.nextLine();
                if (Double.parseDouble(price) > 0 || Integer.parseInt(price) > 0) {
                    house.setPrice(price);
                    break;
                }
            } else if (value.equals("room")) {
                System.out.print("Price: ");
                String price = input.nextLine();
                if (Double.parseDouble(price) > 0 || Integer.parseInt(price) > 0) {
                    room.setPrice(price);
                    break;
                }
            }
        }
    }

    // Check Floor
    private static void checkFloor(String value) {
        while (true) {
            if (value.equals("villa")) {
                System.out.print("Floor: ");
                String floor = input.nextLine();
                if (Integer.parseInt(floor) > 0) {
                    villa.setFloor(floor);
                    break;
                }
            } else if (value.equals("house")) {
                System.out.print("Floor: ");
                String floor = input.nextLine();
                if (Integer.parseInt(floor) > 0) {
                    house.setFloor(floor);
                    break;
                }
            }
        }
    }

    // Check TypeRents
    private static void checkTypeRents(String value) {
        while (true) {
            if (value.equals("villa")) {
                System.out.print("Type Rents: ");
                String typeRents = input.nextLine();
                if (REGEX_NAME_TYPE_RENTS_STANDARD.matcher(typeRents).matches()) {
                    villa.setTypeRents(typeRents);
                    break;
                }
            } else if (value.equals("house")) {
                System.out.print("Type Rents: ");
                String typeRents = input.nextLine();
                if (REGEX_NAME_TYPE_RENTS_STANDARD.matcher(typeRents).matches()) {
                    house.setTypeRents(typeRents);
                    break;
                }
            } else if (value.equals("room")) {
                System.out.print("Type Rents: ");
                String typeRents = input.nextLine();
                if (REGEX_NAME_TYPE_RENTS_STANDARD.matcher(typeRents).matches()) {
                    room.setTypeRents(typeRents);
                    break;
                }
            }
        }
    }

    // Check Standard
    private static void checkStandard(String value) {
        while (true) {
            if (value.equals("villa")) {
                System.out.print("Standard Room: ");
                String standard = input.nextLine();
                if (REGEX_NAME_TYPE_RENTS_STANDARD.matcher(standard).matches()) {
                    villa.setStandardRoom(standard);
                    break;
                }
            } else if (value.equals("house")) {
                System.out.print("Standard Room: ");
                String standard = input.nextLine();
                if (REGEX_NAME_TYPE_RENTS_STANDARD.matcher(standard).matches()) {
                    house.setStandardRoom(standard);
                    break;
                }
            }
        }
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
                break;
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
        villaList = FuncFileCSV.readFileCSV("villa");
        for (Services villa : villaList) {
            System.out.println(villa.showInfo());
        }
        showServices();
    }

    public static void showAllHouse() {
        houseList = FuncFileCSV.readFileCSV("house");
        for (Services house : houseList) {
            System.out.println(house.showInfo());
        }
        showServices();
    }

    public static void showAllRoom() {
        houseList = FuncFileCSV.readFileCSV("room");
        for (Services room : roomList) {
            System.out.println(room.showInfo());
        }
        showServices();
    }

    public static void showNameVilla() {
        villaList = FuncFileCSV.readFileCSV("villa");
        for (Services nameVilla : villaList) {
            nameVillaNotDuplicate.add(nameVilla.getName());
        }
        System.out.println(nameVillaNotDuplicate);
        displayMainMenu();
    }

    public static void showNameHouse() {
        houseList = FuncFileCSV.readFileCSV("house");
        for (Services nameHouse : houseList) {
            nameHouseNotDuplicate.add(nameHouse.getName());
        }
        System.out.println(nameHouseNotDuplicate);
        displayMainMenu();
    }

    public static void showNameRoom() {
        roomList = FuncFileCSV.readFileCSV("room");
        for (Services nameRoom : roomList) {
            nameRoomNotDuplicate.add(nameRoom.getName());
        }
        System.out.println(nameRoomNotDuplicate);
        displayMainMenu();
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

