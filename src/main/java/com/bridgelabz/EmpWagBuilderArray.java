package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpWagBuilderArray implements EmpWageInterface {

    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;

    //Calculate total wage
    public void calculateEmpWage(CompanyEmpWage companyEmpWage) {
        //VARIABLES
        int empHours;
        int dailyEmpWage;
        int workingHours = 0;
        int workingDays = 0;
        while (  workingHours < companyEmpWage.maxHr && workingDays < companyEmpWage.maxDay )    {
            workingDays++;
            int empCheck = (int) (Math.random() * 10 ) % 3;
            switch (empCheck)  {
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }
            workingHours += empHours;
            dailyEmpWage = empHours * companyEmpWage.wagePrHr;
            companyEmpWage.empMonthlyWages += dailyEmpWage;
            System.out.println("Employee day: " + workingDays + " Employee hours: " + empHours);
            System.out.println("Daily Wage of " + companyEmpWage.companyName + " Employee is: " + dailyEmpWage + "\n");
        }
        System.out.println( "Total Wage Of " + companyEmpWage.companyName + " Employee is: " + companyEmpWage.empMonthlyWages );
    }
    public static void queryOfCompany(){

        EmpWagBuilderArray empWageBuilder = new EmpWagBuilderArray();
        Scanner scanner = new Scanner(System.in);
        //Arraylist
        ArrayList<CompanyEmpWage> company = new ArrayList<>();
        System.out.println("Query of company employee wage");
        System.out.println("1 for Dmart");
        System.out.println("2 for Big Basket");
        System.out.println("3 for Reliance") ;
        int choice = Integer.valueOf(scanner.next());
        switch(choice) {
            case 1:
                CompanyEmpWage wage1 = new CompanyEmpWage("MartD",15,50,25);
                company.add(wage1);
                empWageBuilder.calculateEmpWage(wage1);
                break;
            case 2:
                CompanyEmpWage wage2 = new CompanyEmpWage("Big Basket",26,65,33);
                company.add(wage2);
                empWageBuilder.calculateEmpWage(wage2);
                break;
            case 3:
                CompanyEmpWage wage3 = new CompanyEmpWage("Reliance",25,45,30);
                company.add(wage3);
                empWageBuilder.calculateEmpWage(wage3);
                break;
            default:
                System.out.println("Invalid Option choose write option");
                System.out.println("1 for Dmart");
                System.out.println("2 for Big Basket");
                System.out.println("3 for Reliance") ;
                break;
        }
    }
    public static void main(String[] args) {
        System.out.println( " Welcome to Employee Wage Computation Program " );
        queryOfCompany();
    }
}