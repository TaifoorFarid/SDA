import java.util.ArrayList;

class BudgetCalculation {
    // Method to calculate the total budget
    public double calBudget(ArrayList<Data> items) {
        double total = 0.0;
        for (Data item : items) {
            total += item.getPrice();
        }
        return total;
    }
}