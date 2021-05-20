package com.bridgelabz;

public class EmployeeWage {
    private static final int IS_Full_TIME = 1;
    private static final int WAGE_PER_HR = 20;
    private static final int IS_PART_TIME = 2;
    private static final int MAX_HR = 100;
    private static final int MAX_DAY = 20;

    public static void main(String[] args) {

        int empHR = 0;
        int empWage=0;
        int totalWorkingHr = 0;
        int day = 0;
        while (totalWorkingHr < MAX_HR && day < MAX_DAY){

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
            empWage = empWage + (WAGE_PER_HR * empHR);
            day++;
            totalWorkingHr = totalWorkingHr + empHR;
        }
        System.out.println("Employee monthly wage: " + empWage);
        System.out.println("Employee total working hours: " + totalWorkingHr);

    }
}

