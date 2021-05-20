package com.bridgelabz;

public class EmployeeWage {
    private static final int IS_PRESENT = 1;
    private static final int  WAGE_PER_HR = 20;
    private static final int IS_PART_TIME = 2;

    public static void main(String[] args) {

        int empHR = 0;

        double empCheck = Math.floor(Math.random() * 10) % 3;
        System.out.println(empCheck);
        //full time
        if(empCheck == IS_PRESENT) {
            empHR = 8;
        }
        //part time
        if(empCheck == IS_PART_TIME) {
            empHR = 4;
        }
        int empWage = WAGE_PER_HR * empHR;
        System.out.println("Employee wage: " + empWage);
    }
}

