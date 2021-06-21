package com.company.factory;

public class HourlyEmployee extends Employee{
    int hoursWorked;
    double rate;

    public HourlyEmployee(String id,String name,int hoursWorked,double rate){
        this.hoursWorked=hoursWorked;
        this.rate=rate;
        this.id=id;
        this.name=name;
    }

    public double calcSalary(){
        return this.rate*this.hoursWorked;
    }
}
