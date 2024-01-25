import java.util.*;
class Main
{
  public static void reccursion(int num)
  {
    if(num>0)
    {
      reccursion(num/2);
      System.out.print(num%2);
    }
  }
  public static void main(String args[])
  {
   Scanner s = new Scanner(System.in);
  int num;
    num = s.nextInt();
    reccursion(num);
  }
}