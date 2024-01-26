import java.util.*;
public class Main
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int sal,pay,hostel,food,par;
      sal = s.nextInt();
      pay = s.nextInt();
      hostel = s.nextInt();
      food = s.nextInt();
      par = s.nextInt();
      int exp;
      exp = pay+hostel+food+par;
      if(exp < sal)
        System.out.print("He can save the money");
      else if(exp == sal)
        System.out.print("He can manage the expenses");
      else
        System.out.print("He has to work hard");
        
    }
  }