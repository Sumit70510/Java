class A extends Thread {
    
    public void run() 
    { 
      for(int i=5;i>0;i--)
        {System.out.println("In thread A i = "+i);}          
    } 
} 
class B extends Thread {
     
    public void run() 
    { 
      for(int j=5;j>0;j--)
        {System.out.println("In thread B j = "+j);} 
    } 
} 

public class THREAD{ 
    public static void main(String[] args) 
    {  A a=new A();
       B b=new B();  
       a.start();
       b.start();
    } 
} 
