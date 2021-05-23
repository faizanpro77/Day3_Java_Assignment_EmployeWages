package com.bridgelabz;

public class EmployeeWage {

    private static final int IS_Full_TIME = 1;
    private static final int IS_PART_TIME = 2;

    private final String company;
    private final int wagePerHour;
    private final int maxHr;
    private final int maxDay;

    public EmployeeWage(String company, int wagePerHour, int maxHr, int maxDay) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxHr = maxHr;
        this.maxDay = maxDay;
    }


    public  int employeeWageForCompany() {
        int empHR = 0;
        int empWage=0;
        int totalWorkingHr = 0;
        int day = 0;
        while (totalWorkingHr < maxHr && day < maxDay){

            int empCheck = (int) (Math.floor(Math.random() * 10)) % 3;

            switch (empCheck) {
                case IS_Full_TIME:
                    empHR = 8;
                    break;
                case IS_PART_TIME:
                    empHR = 4;
                    break;
                default:
                     empHR = 0;
                     break;
            }
            empWage = empWage + (wagePerHour * empHR);
            day++;
            totalWorkingHr = totalWorkingHr + empHR;
        }
        System.out.println("Employee " + company + " total working hours: " + totalWorkingHr);
        return empWage;
    }
    public static void main(String[] args){
        EmployeeWage dmart = new EmployeeWage("Dmart",20,30,20);
        System.out.println("Employee monthly wage for Dmart : " + dmart.employeeWageForCompany());
        EmployeeWage Reliance = new EmployeeWage("Reliance",35,40,30);
        System.out.println("Employee monthly wage for Reliance : " + Reliance.employeeWageForCompany());
    }
}

