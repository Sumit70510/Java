import java.util.Scanner;
class Parent {
    static int Multiply(int a, int b)
     {return a * b;}
    static double Multiply(double a, double b)
     {return a * b;} 
    void Print()
     {System.out.println("parent class");}
}
class subclass1 extends Parent {
     void Print() { System.out.println("subclass1"); }
 }
class subclass2 extends Parent {
    void Print()
     {System.out.println("subclass2");}
 }
class POLYMORPHISM {
    public static void main(String[] args)
    {
        System.out.println(Parent.Multiply(34, 54));
        System.out.println(Parent.Multiply(25.5, 16.3));
        Parent a;
        a = new subclass1();
        a.Print();
        a = new subclass2();
        a.Print();
    }
}