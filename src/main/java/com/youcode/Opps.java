package com.youcode;

public class Opps {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.pay();
    }
}

interface Payable{
    void pay();
    public static class Implementation implements Payable{
        @Override
        public void pay() {
            System.out.println("default pay impl");
        }
    }
}


class Employee extends Payable.Implementation{
    private Payable delegate =  new Payable.Implementation();
    public void pay(){delegate.pay();}
}

