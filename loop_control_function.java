import java.util.Scanner;
public class loop_control_function
{
   public static void main(String args[])
  { Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("ENTER SIZE OF ARRAY : ");
    n=sc.nextInt();
    int [] arr_list=  new int[n];
    System.out.println("ENTER THE ARRAY :- ");
   for(int i=0;i<n;i++)
    {arr_list[i]=sc.nextInt();}
   System.out.println("WANT TO PRINT ARRAY YOU ENTERED PRESS (Y/N) : ");
   char a=sc.next().charAt(0);
   if(a=='y'||a=='Y')
    {display(arr_list,n);}
  }
  public static void display(int [] arr_list,int n)
  {
    for(int i=0;i<n;i++)
    {System.out.println(arr_list[i]);}    
  }
}