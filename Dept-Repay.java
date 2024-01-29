import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      int pri,rate,yrs;
      double tot,si,fin,dis;
      Scanner s = new Scanner(System.in);
      pri = s.nextInt();
      rate = s.nextInt();
      yrs = s.nextInt();
      si = (pri * rate * yrs)/100;
      tot = pri + si;
      dis = (si*2)/100;
      fin = tot-dis;
      System.out.printf("%.2f\n%.2f\n%.2f\n%.2f",si,tot,dis,fin);
    }
}