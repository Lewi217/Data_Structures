import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 0:
                        printInstructions();
                        break;
                    case 1:
                        groceryList.printGroceryList();
                        break;
                    case 2:
                        addItem();
                        break;
                    case 3:
                        modifyItem();
                        break;
                    case 4:
                        removeItem();
                        break;
                    case 5:
                        searchForItem();
                        break;
                    case 6:
                        quit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose a valid option.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input
            }
        }
        scanner.close(); // Closing the scanner
    }

    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println(" 0 - To print choice options.");
        System.out.println(" 1 - To print the list of grocery items.");
        System.out.println(" 2 - To add an item to the list.");
        System.out.println(" 3 - To modify an item in the list.");
        System.out.println(" 4 - To remove an item from the list.");
        System.out.println(" 5 - To search for an item in the list.");
        System.out.println(" 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        if (itemNo > 0 && itemNo <= groceryList.size()) {
            System.out.print("Enter replacement item: ");
            String newItem = scanner.nextLine();
            groceryList.modifyGroceryItem(itemNo - 1, newItem);
        } else {
            System.out.println("Invalid item number.");
        }
    }

    public static void removeItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        if (itemNo > 0 && itemNo <= groceryList.size()) {
            groceryList.removeGroceryItem(itemNo - 1);
        } else {
            System.out.println("Invalid item number.");
        }
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
}
