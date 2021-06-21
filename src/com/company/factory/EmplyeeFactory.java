package com.company.factory;

public class EmplyeeFactory {


    public Employee getInstance(String type,String name,int hoursWorked,double rate){
        Employee employee=null;

        if(type.equals("hourly")){
            employee=new HourlyEmployee("1",name,hoursWorked,rate);
        }

        else if(type.equals("monthly")){
            employee=new MonthlyEmployee("2",name,rate);
        }

        else if(type.equals("daily")){
//            Employee amara=new MonthlyEmployee("2",name,rate);
//            System.out.println("Salary of Amara is: "+amara.calcSalary());
        }
        else if(type.equals("contract")){
            employee= new ContactBasisEmployee("2",name,rate);
        }
        return  employee;

    }
}
