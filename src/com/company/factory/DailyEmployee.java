package com.company.factory;

public class DailyEmployee extends  Employee {
    int daysWorked;
    double rate;

    public DailyEmployee(String id,String name,double rate){
        this.daysWorked=daysWorked;
        this.rate=rate;
        this.id=id;
        this.name=name;

    }

    public double calcSalary(){
        return this.daysWorked*this.rate;
    }


}
