import java.util.*;
public class Main{
  public static void main(String args[])
  {
    int w,x,y,tot;
    Scanner s = new Scanner(System.in);
    w = s.nextInt();
    x = s.nextInt();
    y = s.nextInt();
    tot = (((x*w) - (y*w))-100);
    System.out.print(tot);
  }
}