import java.util.ArrayList;

class Items {
    private ArrayList<Data> items = new ArrayList<>();

    // Method to add a Data item
    public void addItem(Data data) {
        items.add(data);
        System.out.println(data.getItemName() + " added to the items list.");
    }

    // Method to delete a Data item
    public void deleteItem(Data data) {
        if (items.remove(data)) {
            System.out.println(data.getItemName() + " removed from the items list.");
        } else {
            System.out.println(data.getItemName() + " not found in the items list.");
        }
    }

    // Method to get all items
    public ArrayList<Data> getItems() {
        return items;
    }
}