package b12_java_collection_frameword.exercise.manage_product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    static Scanner input = new Scanner(System.in);
    public static ArrayList<Product> listProduct = new ArrayList<>();

    public static void mainMenu() {
        int chooseMenu;
        do {
            System.out.println("1. Add New Product");
            System.out.println("2. Delete Product");
            System.out.println("3. Edit Product");
            System.out.println("4. Show Product");
            System.out.println("5. Search Product");
            System.out.println("6. Sort product list ascending by price");
            System.out.println("7. Sort product list descending by price");
            System.out.println("8. Exit");
            System.out.print("Your choose: ");

            chooseMenu = input.nextInt();
            input.skip("\n");
        } while (chooseMenu < 0 || chooseMenu > 8);

        switch (chooseMenu) {
            case 1: {
                addProduct();
                break;
            }
            case 2: {
                deleteProduct();
                break;
            }
            case 3: {
                editProduct();
                break;
            }
            case 4: {
                displayProduct();
                break;
            }
            case 5: {
                searchProduct();
                break;
            }
            case 6: {
                PriceIncreaseComparator priceIncreaseComparator = new PriceIncreaseComparator();
                Collections.sort(listProduct, priceIncreaseComparator);
                for (Product product: listProduct){
                    System.out.println(product.toString());
                }
                mainMenu();
                break;
            }
            case 7: {
                PriceDecreaseComparator priceDecreaseComparator = new PriceDecreaseComparator();
                Collections.sort(listProduct, priceDecreaseComparator);
                for (Product product : listProduct) {
                    System.out.println(product.toString());
                }
                mainMenu();
            }
            case 8: {
                return;
            }
        }
    }

    public static void addProduct() {
        String name;
        int id;
        int price;

        System.out.println("\nEnter information of product: ");
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Price: ");
        price = input.nextInt();
        if (listProduct.isEmpty()) {
            id = 0;
        } else {
            id = listProduct.get(listProduct.size() - 1).getId() + 1;
        }
        Product product = new Product(name, id, price);
        listProduct.add(product);
        System.out.println(product.toString());
        mainMenu();
    }

    public static void deleteProduct() {
        int choose;
        do {
            System.out.println("What information do you want to delete ?");
            System.out.println("1. Name");
            System.out.println("2. ID");
            System.out.print("Your choose: ");
            choose = Integer.parseInt(input.nextLine());

        } while (choose < 0 || choose > 2);

        switch (choose) {
            case 1: {
                System.out.print("Enter name to delete: ");
                String name = input.nextLine();
                Product product = searchNameProduct(name);
                listProduct.remove(product);
                break;
            }
            case 2: {
                System.out.print("Enter id to delete: ");
                int id = Integer.parseInt(input.nextLine());
                Product product = searchIDProduct(id);
                listProduct.remove(product);
                break;
            }
        }
        mainMenu();
    }

    public static void editProduct() {
        int choose;
        do {
            System.out.println("What information do you want to edit ?");
            System.out.println("1. Name");
            System.out.println("2. Price");
            System.out.print("Your choose: ");
            choose = Integer.parseInt(input.nextLine());
        } while (choose < 0 || choose > 2);

        switch (choose) {
            case 1: {
                System.out.print("Enter name to edit: ");
                String name = input.nextLine();
                Product product = searchNameProduct(name);
                System.out.print("Name you edit: ");
                String newName = input.nextLine();
                product.setName(newName);
                displayProduct();
                break;
            }
            case 2: {
                System.out.print("Enter id to edit: ");
                int price = Integer.parseInt(input.nextLine());
                Product product = searchPriceProduct(price);
                System.out.print("Price you edit: ");
                int newPrice = input.nextInt();
                product.setId(newPrice);
                displayProduct();
                break;
            }
        }
        mainMenu();
    }

    public static void displayProduct() {
        for (Product product : listProduct) {
            System.out.println(product.toString());
        }
        mainMenu();
    }

    public static void searchProduct() {
        int choose;
        do {
            System.out.println("What information do you want to search ?");
            System.out.println("1. Name");
            System.out.println("2. ID");
            System.out.print("Your choose: ");
            choose = Integer.parseInt(input.nextLine());

        } while (choose < 0 || choose > 2);

        switch (choose) {
            case 1: {
                System.out.print("Enter name to search: ");
                String name = input.nextLine();
                searchNameProduct(name);
                break;
            }
            case 2: {
                System.out.print("Enter id to search: ");
                int id = Integer.parseInt(input.nextLine());
                searchIDProduct(id);
                break;
            }
        }
        mainMenu();
    }

    public static Product searchNameProduct(String name) {
        for (Product product : listProduct) {
            if (name.equals(product.getName())) {
                System.out.println(product.toString());
                return product;
            }
        }
        return null;
    }

    public static Product searchIDProduct(int id) {
        for (Product product : listProduct) {
            if (id == product.getId()) {
                System.out.println(product.toString());
                return product;
            }
        }
        return null;
    }

    public static Product searchPriceProduct(int price) {
        for (Product product : listProduct) {
            if (price == product.getPrice())
                return product;
        }
        return null;
    }


    public static void main(String[] args) {
        mainMenu();
    }
}


