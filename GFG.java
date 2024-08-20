
// Java program to demonstrate
// runtime polymorphism
 
// Implementing a class
class Test {
    public void phone( )
     {System.out.println("hello");}
    // Implementing a method
    public void method()
    {
        System.out.println("Method 1");
    }
}
 
// Defining a child class
public class GFG extends Test {
 
    // Overriding the parent method
    public void method()
    {
        System.out.println("Method 2");
    }
 
    // Driver code
    public static void main(String args[])
    {
        Test test = new GFG();
 
        test.method();
        test.phone();
    }
}