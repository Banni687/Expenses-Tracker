import java.util.ArrayList;
import java.util.Scanner;

    
    

class Expense {
  String category;
  double amount;
  String description;

  Expense(String category, double amount, String description) {
    this.category = category;
    this.amount = amount;
    this.description = description;
  }
}

public class ExpenseTracker {
  private ArrayList<Expense> expenses;
  private double totalExpense;

  public ExpenseTracker() {
    expenses = new ArrayList<>();
    totalExpense = 0;
  }

  public void addExpense() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter category: ");
    String category = scanner.nextLine();

    System.out.print("Enter amount: ");
    double amount = scanner.nextDouble();
    scanner.nextLine(); // Consume newline left-over

    System.out.print("Enter description: ");
    String description = scanner.nextLine();

    Expense expense = new Expense(category, amount, description);
    expenses.add(expense);
    totalExpense += amount;
  }

  public void viewExpenses() {
    System.out.println("Expenses:");
    for (Expense expense : expenses) {
      System.out.println("Category: " + expense.category);
      System.out.println("Amount: " + expense.amount);
      System.out.println("Description: " + expense.description);
      System.out.println();
    }
  }

  public void calculateTotalExpense() {
    System.out.println("Total Expense: " + totalExpense);
  }

  public static void main(String[] args) {
    ExpenseTracker expenseTracker = new ExpenseTracker();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("1. Add Expense");
      System.out.println("2. View Expenses");
      System.out.println("3. Calculate Total Expense");
      System.out.println("4. Exit");
      System.out.println();

      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();
      scanner.nextLine(); // Consume newline left-over

      switch (choice) {
        case 1:
          expenseTracker.addExpense();
          break;
        case 2:
          expenseTracker.viewExpenses();
          break;
        case 3:
          expenseTracker.calculateTotalExpense();
          break;
        case 4:
          System.out.println("Exiting...");
          return;
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }
}


