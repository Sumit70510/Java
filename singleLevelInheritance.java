import java.io.*;
//mport java.lang.*;
import java.util.*;
class one {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}
  
class two extends one {
    public void print_for() { System.out.println("for"); }
}
  
class three extends two {
    public void print_geek()
    {  // super.print_geek();
        System.out.println("Greeks");
    }
}
  
// Drived class
public class singleLevelInheritance {
    public static void main(String[] args)
    {
        three g = new three();
		two f=new two();
		one z=new one();
		z.print_geek();
		f.print_geek();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}