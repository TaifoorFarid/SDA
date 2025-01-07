
public class BudgetCalculationApp {
    public static void main(String[] args) {
        Items itemList = new Items();
        BudgetCalculation budgetCalc = new BudgetCalculation();

        // Adding items
        Data item1 = new Data("Laptop", 1000.00);
        Data item2 = new Data("Headphones", 200.00);

        itemList.addItem(item1);
        itemList.addItem(item2);
        itemList.addItem(new Data("Watch", 10_000));

        // Calculating and displaying the total budget
        double totalBudget = budgetCalc.calBudget(itemList.getItems());
        System.out.println("Total Budget: $" + totalBudget);

        // Removing an item and recalculating
        itemList.deleteItem(item1);
        totalBudget = budgetCalc.calBudget(itemList.getItems());
        System.out.println("Updated Total Budget: $" + totalBudget);
    }
}