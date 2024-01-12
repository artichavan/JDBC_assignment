package cashbook.controller;

import cashbook.entities.Income;
import cashbook.service.IncomeServices;

public class IncomeController {
    public static void addIncome(Income income){
        IncomeServices incomeServices=new IncomeServices();
        incomeServices.addIncome(income);
    }
}
