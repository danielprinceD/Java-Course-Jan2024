import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    int f1=0,f2=1,num,em;
    Scanner s = new Scanner(System.in);
    num = s.nextInt();
    while(f1<=num)
      {
        if(f1==num)
        {
          System.out.print("Fibonacci Number");
          return;
        }
        em = f2;
        f2 = f1+f2;
        f1 = em; 
      }
    System.out.print("Not Fibonacci Number");
  }
}