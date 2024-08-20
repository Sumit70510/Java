import java.util.*;
import java.lang.*;

class PrintTest extends Thread {
 
    // Non synchronized Code
 
    // Method 1
    public void printThread(int n)
    {
         synchronized(this)
          {    
        // This loop will print the  currently executed
        // thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread " + n
                                + " is working...");
           } 
     }
    }
}
 
// Class 2
// Helper class extending Thread Class
 class Thread1 extends Thread {
 
    // Declaring variable of type Class1
    PrintTest test;
 
    // Constructor for class1
    Thread1(PrintTest p) { test = p; }
 
    // run() method of this class for
    // entry point for thread1
    public void run()
    {
 
        // Calling method  1 as in above class
        test.printThread(1);
    }
}
 
// Class 3
// Helper class extending Thread Class
 class Thread2 extends Thread {
 
    // Declaring variable of type Class1
    PrintTest test;
 
    // Constructor for class2
    Thread2(PrintTest p) { test = p; }
 
    // run() method of this class for
    // entry point for thread2
    public void run() { test.printThread(2); }
}
 
// Class 4
// Main class
public class SynchroTest extends Thread {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating object of class 1 inside main() method
        PrintTest p = new PrintTest();
 
        // Passing the same object of class PrintTest to
        // both threads
        Thread1 t1 = new Thread1(p);
        Thread2 t2 = new Thread2(p);
 
        // Start executing the threads
        // using start() method
        t1.start();
        t2.start();
 
        // This will print both the threads  simultaneously
    }
}