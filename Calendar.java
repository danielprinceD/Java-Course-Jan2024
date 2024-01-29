import java.util.*;
public class Main
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int mon,year;
      boolean leap=false;
      mon = s.nextInt();
      year = s.nextInt();
      switch(year%4)
        {
          case 0:
            leap = true;
            break;
        }
      switch(mon)
        {
          case 1:
          case 3:  
          case 5:  
          case 7:  
          case 8:  
          case 10:  
          case 12:
            System.out.print("Number of days is 31");
            break;
          case 2:
            if(leap)
              System.out.print("Number of days is 29");
            else
              System.out.print("Number of days is 28");
            break;
          default:
            System.out.print("Number of days is 30");
        }
    }
  }