package com.bridgelabz;

import java.util.ArrayList;

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
        }
        System.out.println( "Total Wage Of " + companyEmpWage.companyName + " Employee is: " + companyEmpWage.empMonthlyWages );
    }

    public static void main(String[] args) {
        System.out.println( " Welcome to Employee Wage Computation Program " );
        EmpWagBuilderArray empWageBuilder = new EmpWagBuilderArray();
        CompanyEmpWage wage1 = new CompanyEmpWage("MartD",15,50,25);
        CompanyEmpWage wage2 = new CompanyEmpWage("Big Basket",26,65,33);
        CompanyEmpWage wage3 = new CompanyEmpWage("Reliance",25,45,30);

        ArrayList<CompanyEmpWage> list = new ArrayList<>();
        list.add(wage1);
        list.add(wage2);
        list.add(wage3);
        empWageBuilder.calculateEmpWage(wage1);
        empWageBuilder.calculateEmpWage(wage2);
        empWageBuilder.calculateEmpWage(wage3);
        System.out.println(list);
    }
}