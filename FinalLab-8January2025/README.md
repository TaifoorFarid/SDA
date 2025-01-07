# Budget Calculation - Shop Assistance

This project implements a simple **Budget Calculation** use case for a shop assistance system using **Java**. It allows users to manage a list of items with their prices and calculate the total budget.  

---

## Folder Structure
The project files are located in the following path:  
```
FinalLab-8January2025/ShopAssistance/BudgetCalculation/src
```

All Java files, including the main application file `BudgetCalculationApp.java`, are present in this directory.

---

## How to Run the Files
Follow these steps to run the project using your IDE:

1. **Download or Clone the Repository**  
   Navigate to the folder where the repository is located:  
   ```
   FinalLab-8January2025/ShopAssistance/BudgetCalculation/src
   ```

2. **Open the Project in Your IDE**  
   - Open your preferred Java IDE (such as IntelliJ IDEA, Eclipse, or NetBeans).
   - Import the project or directly open the `src` folder containing all `.java` files.

3. **Run the Main Application**  
   Locate the `BudgetCalculationApp.java` file in your IDE, which contains the `public static void main(String[] args)` method.  
   Right-click on `BudgetCalculationApp.java` and select **Run** or **Execute**.

4. **Interact with the Application**  
   - Add items with their prices, remove items, and calculate the total budget by following on-screen instructions.

---

## What This Code Does
This project demonstrates the **Budget Calculation** use case, representing a class diagram with the following Java classes:

1. **Data Class**  
   Represents an individual item with:
   - `itemName`: The name of the item (String).
   - `price`: The price of the item (double).  
   Includes getter and setter methods for each field.

2. **Items Class**  
   Manages a collection of `Data` objects:
   - Uses an `ArrayList<Data>` to store items.
   - Provides `addItem(Data data)` and `deleteItem(Data data)` methods for adding and removing items.

3. **BudgetCalculation Class**  
   Calculates the total budget by summing the prices of all items:
   - Method `calBudget(ArrayList<Data> items)` returns the total budget as a `double`.

4. **BudgetCalculationApp Class**  
   The main application class that:
   - Adds and deletes items.
   - Calculates and displays the total budget.

---

## Example Output
```
Laptop added to the items list.
Headphones added to the items list.
Total Budget: $1200.0
Laptop removed from the items list.
Updated Total Budget: $200.0
```

---

## Technologies Used
- **Java** (IDE-supported)
- **Command-line Interface (CLI)** for interacting with the application.

---

## Author
**Taifoor**  
Software Engineering Student  
COMSATS University Islamabad, Virtual Campus

---

Happy Coding!
