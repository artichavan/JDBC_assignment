package cashbook.controller;

import cashbook.entities.Expense;
import cashbook.service.ExpenseServices;

public class ExpenseController {
    public void addExpense(Expense expense){
        ExpenseServices expenseServices=new ExpenseServices();
        expenseServices.addExpense(expense);
    }
}
