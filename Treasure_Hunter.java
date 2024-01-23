import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner (System.in);
    int a,b,c;
    a = s.nextInt();
    b= s.nextInt();
    c = s.nextInt();
    int shareA = (a*b)/100;
    int shareB = ((a-shareA)*c)/100;
    int shareC = (a - shareA - shareB)/3;
    System.out.printf("%d\n%d\n%d", shareA,shareB,shareC);
    
  }
}
