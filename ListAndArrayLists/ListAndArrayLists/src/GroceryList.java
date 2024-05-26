import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list:");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        if (position >= 0 && position < groceryList.size()) {
            groceryList.set(position, newItem);
            System.out.println("Grocery item " + (position + 1) + " has been modified.");
        } else {
            System.out.println("Invalid item position.");
        }
    }

    public void removeGroceryItem(int position) {
        if (position >= 0 && position < groceryList.size()) {
            String theItem = groceryList.get(position);
            groceryList.remove(position);
            System.out.println("Grocery item " + (position + 1) + " has been removed.");
        } else {
            System.out.println("Invalid item position.");
        }
    }

    public String findItem(String searchItem) {
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }

    public int size() {
        return groceryList.size();
    }
}
