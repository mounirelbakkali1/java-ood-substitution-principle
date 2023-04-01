package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var stack1 = new StackFollowLSP<String>();
        var stack2 = new StackDontFollowLSP<String>();

        stack1.push("Mounir");
        stack1.push("Ahmed");

        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());

        stack2.push("Mounir");
        stack2.push("Ahmed");
        stack2.clear();
        try {
            String popedItem =stack2.pop(); // will throw an exeption
        }catch (Exception e){
            System.err.println("EXEPTION "+e.getMessage());
        }
    }
}
