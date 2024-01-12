package cashbook.service;


import cashbook.dao.IncomeDao;
import cashbook.entities.Income;

public class IncomeServices {
    public void addIncome(Income income){
        IncomeDao incomeDao=new IncomeDao();
        incomeDao.addIncome(income);
    }
}
