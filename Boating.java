import java.util.*;
public class Main
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int boat,a,c,tot;
      boat = s.nextInt();
      a = s.nextInt();
      c = s.nextInt();
      a = a * 75;
      c = c * 30;
      tot = a+c;
      if(tot <= boat)
        System.out.print("Boat is stable");
      else
        System.out.print("Boat will drown");
    }
  }