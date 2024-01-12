package cashbook.app;


import cashbook.controller.IncomeController;
import cashbook.entities.Income;

import java.util.Scanner;

public class IncomeApp {
    public static void main(String[] args) {
        Income income=acceptIncomeDetailsFromUser();
        IncomeController incomeController=new IncomeController();
        IncomeController.addIncome(income);
    }
    private static Income acceptIncomeDetailsFromUser(){
        //accept input:income title,amount,notes,date
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter income title");
        String title=scanner.nextLine();
        System.out.println("enter income amount");
        int amount =scanner.nextInt();
        System.out.println("enter income notes");
        String notes=scanner.nextLine();
        Income income=new Income();
        income.setTitle(title);
        income.setAmount(amount);
        income.setNotes(notes);
        return income;
    }
}
