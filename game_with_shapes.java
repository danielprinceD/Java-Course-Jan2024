import java.util.*;
public class Main
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int cir,sq;
      cir = s.nextInt();
      sq = s.nextInt();
      if(cir > sq)
        System.out.print("circle cannot be inside a Square");
      else  
      System.out.print("circle can be inside a square");
    }
  }