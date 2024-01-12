package cashbook.service;

import cashbook.dao.ExpenseDao;
import cashbook.entities.Expense;

public class ExpenseServices {
    public void addExpense(Expense expense){
        ExpenseDao expenseDao=new ExpenseDao();
        expenseDao.addExpense(expense);
    }
}
