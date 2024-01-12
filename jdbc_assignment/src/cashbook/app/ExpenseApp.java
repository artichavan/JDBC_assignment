package cashbook.app;

import cashbook.controller.ExpenseController;
import cashbook.entities.Expense;

import java.util.Scanner;

public class ExpenseApp {
    public static void main(String[] args) {
        Expense expense=acceptExpenseDetailsFromUser();
        ExpenseController expenseController=new ExpenseController();
        expenseController.addExpense(expense);
    }
    private static Expense acceptExpenseDetailsFromUser(){
        //accept input:expense title,amount,notes,date
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter expense title");
        String title=scanner.nextLine();
        System.out.println("enter expense amount");
        int amount =scanner.nextInt();
        System.out.println("enter expense notes");
        String notes=scanner.nextLine();
        Expense expense=new Expense();
        expense.setTitle(title);
        expense.setAmount(amount);
        expense.setNotes(notes);
        return expense;
    }
}
