import java.util.Scanner;
public class Main{
  public static void main(String args[])
  {
    double item1,item2,tot,d_pri,amt_saved,dis;
    Scanner s = new Scanner(System.in);
    item1 = s.nextDouble();
    item2 = s.nextDouble();
    dis = s.nextDouble();
    tot = item1 + item2;
    d_pri = tot - (tot*dis*0.01);
    amt_saved = tot - d_pri;
    System.out.printf("%.2f %.2f %.2f",tot,d_pri,amt_saved);
  }
}