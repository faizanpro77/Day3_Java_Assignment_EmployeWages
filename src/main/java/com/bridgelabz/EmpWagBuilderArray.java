package com.bridgelabz;

public class EmpWagBuilderArray {

    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;

    //EMPLOYEE WAGE COMPUTATION
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
        // Array
        CompanyEmpWage[] company = new CompanyEmpWage[3];
        // Object creation
        company[0] = new CompanyEmpWage("DMart",15,50,25);
        empWageBuilder.calculateEmpWage(company[0]);
        company[1] = new CompanyEmpWage("Big Basket",26,65,33);
        empWageBuilder.calculateEmpWage(company[1]);
        company[2] = new CompanyEmpWage("Reliance",25,45,30);
        empWageBuilder.calculateEmpWage(company[2]);
    }
}