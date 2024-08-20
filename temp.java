

import java.util.Scanner;

public class temp {

    public static void main(String[] args) {
       // System.out.println("ola como estas!");


	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Enter Name: ");
	    String name = scanner.nextLine();

	    System.out.println("Enter Age: ");
	    int age = scanner.nextInt();

	    System.out.println("Enter Blood Group: ");
	    String blood = scanner.next();

	    String clr="INVALID";

	    if(age>=10)
        {
		    if(age<15)
             {
			    clr="YELLOW";
	    		System.out.println(clr);
		     }
		     else 
               if(age>=15)
                 {
	    		    if(age<20)
                       {clr="BLUE" ;
				        System.out.println(clr);
	    		       }
	    	        else 
                       if(age>=20)
                         {
	    			      clr="RED";
				          System.out.println("clr");
			             } 
		          }
	     }  
        else 
          {
		    System.out.println(clr);
	      }


	    System.out.println( "_________" +"\n"+"Name: "+ name + "\n" +"Age: "+age+ "\n" +"Blood Group: "+blood+"\n"+"_________"+"\n"+"Your group is "+clr+"\n"+"_________");
	    scanner.close();

    }
}