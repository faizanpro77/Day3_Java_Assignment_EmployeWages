package com.bridgelabz;

public class EmployeeWage {
    private static String company;

    public static void employeeWageForCompany(String company, int wagePerHour, int maxHr, int maxDay) {
       // EmployeeWage.company = company;
        int empHR = 0;
        int empWage=0;
        int totalWorkingHr = 0;
        int day = 0;
        while (totalWorkingHr < maxHr && day < maxDay){

            int empCheck = (int) (Math.floor(Math.random() * 10)) % 3;

            switch (empCheck) {
                case 1:
                    empHR = 8;
                    break;
                case 2:
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

