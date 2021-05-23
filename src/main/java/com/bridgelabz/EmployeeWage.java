package com.bridgelabz;

public class EmployeeWage {

    private static final int IS_Full_TIME = 1;
    private static final int IS_PART_TIME = 2;

    public static void employeeWageForCompany(String company, int wagePerHour, int maxHr, int maxDay) {
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
        System.out.println("Employee monthly wage for company " + company + " : " + empWage);
        System.out.println("Employee total working hours: " + totalWorkingHr);
    }
    public static void main(String[] args){
        employeeWageForCompany("Dmart",20,30,20);
    }
}

