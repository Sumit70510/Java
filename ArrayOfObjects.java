public class ArrayOfObjects  
{  
  public static void main(String args[])  
   {  
//create an array of product object   
    Product[] obj = new Product[5] ;  
//create & initialize actual product objects using constructor  
    obj[0] = new Product(11,"Laptop");  
    obj[1] = new Product(12,"HP");   
    obj[2] = new Product(13,"LG TV");  
    obj[3] = new Product(14,"MI Max 9");  
    obj[4] = new Product(15,"-USB");  
//display the product object data  
    System.out.println("Object 1 : ");  
    obj[0].display();  
    System.out.println("Object 2 : ");  
    obj[1].display();  
    System.out.println("Object 3 : ");  
    obj[2].display();  
    System.out.println("Object 4 : ");  
    obj[3].display();  
    System.out.println("Object 5 : ");  
    obj[4].display();  
   }  
}  
//Product class with product Id and product name as attributes  
class Product  
{  
  int pro_Id;  
  String pro_name;  
//Product class constructor  
  Product(int pid, String n)  
   {  
    pro_Id = pid;  
    pro_name = n;  
   }  
  void display()  
   {   
     System.out.print("Id = "+pro_Id +"  "+ "Name = "+pro_name);  
     System.out.println();  
   }  
 }