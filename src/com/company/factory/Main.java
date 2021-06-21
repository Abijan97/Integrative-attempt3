package com.company.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Enter the Emplyee Type: ");
        Scanner scanner=new Scanner(System.in);
        String type=scanner.next();

        System.out.println("Enter the Name: ");
        String name=scanner.next();

        System.out.println("Enter the hours worked: ");
        int hoursWorked=scanner.nextInt();

        System.out.println("Enter the rate: ");
        double rate=scanner.nextDouble();

        EmplyeeFactory emplyeeFactory=new EmplyeeFactory();
        Employee employee=emplyeeFactory.getInstance(type,name,hoursWorked,rate);


        System.out.println("Salary of Employee is: "+employee.calcSalary());





    }

}
