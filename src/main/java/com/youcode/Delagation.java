package com.youcode;

public class Delagation {
    public static void main(String[] args) {
        Specialization specialization = new Specialization();
        specialization.f();

    }
    interface Simple{
        void f();
        public static class Implementation implements Simple{
            @Override public void f(){
                System.out.println("do something");
            }
        }
    }
    public static  class Specialization implements Simple{
        // delegation principle
        Simple delegate  = new Simple.Implementation();

        @Override
        public void f() {
                delegate.f();
                // could now provide our version of f function without fragility problems
        }
    }
}

class WithoutDelegation{
    public static class Simple{
        public void f(){
            System.out.println("i am f function");
        }
    }
    public static class Specialization extends Simple{
        @Override public void f(){
            System.out.println("i am f in different version");
        }
    }
    public static class SpecializationTwo extends Simple{
        @Override public void f(){
            throw new RuntimeException("I can't do f :( ");
        }
    }

}





