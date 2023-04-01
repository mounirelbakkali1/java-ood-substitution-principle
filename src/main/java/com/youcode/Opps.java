package com.youcode;

public class Opps {
    public static void main(String[] args) {
        Payable[] payables = {
          new Contractor(),
                new Employee(),
                new Vendor()
        };
        for (Payable payable : payables) payable.pay();
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


class Employee implements Payable{
    private Payable delegate =  new Payable.Implementation();
    public void pay(){delegate.pay();}
}

class Contractor extends Payable.Implementation{}

class Vendor implements Payable{
    @Override
    public void pay() {
        System.out.println("i am payed differently");

    }
}

