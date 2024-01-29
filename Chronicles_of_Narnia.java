import java.util.*;
public class Main{
  public static void main(String args[])
  {
    int num,rem=0;
    Scanner s = new Scanner(System.in);
    num = s.nextInt();
    while(num>0)
      {
        rem +=num%10;
        num/=10;
      }
    System.out.print(rem);
    
  }
}