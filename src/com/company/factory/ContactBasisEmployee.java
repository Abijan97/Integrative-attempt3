package com.company.factory;

public class ContactBasisEmployee extends Employee {

    double rate;

    public ContactBasisEmployee(String id,String name,double rate){
        this.rate=rate;
        this.id=id;
        this.name=name;
    }


    public double calcSalary(){
        return this.rate-rate*0.05;
    }
}
