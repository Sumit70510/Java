import java.util.Scanner;
 public class overload {    
     public int add(int a, int b)
     {  return a+b; } 
    public int add(int a,int b,int c)
     {  return a+b+c;} 
    public static void main(String[]args)
    { overload o= new overload();
     Scanner sc= new Scanner(System.in); 
     System.out.println("Enter val of A : ");
     int a=sc.nextInt();
     System.out.println("Enter val of B : ");
     int b=sc.nextInt();
     System.out.println("Enter val of C : ");
     int c=sc.nextInt(); 
     System.out.println("Sum of (a,b,c) : ");
     System.out.println(o.add(a,b,c));
     System.out.println("Sum of (b,c) : ");
     System.out.println(o.add(b,c));
     System.out.println("Sum of (a,c) : ");
     int z=o.add(a,c); 
     System.out.println(z);     
} 
}
