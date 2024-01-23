import java.util.*;
class Main
{
 public static void main(String args[]) 
{

    double d1,d2;
    int c1,c2;
  Scanner s = new Scanner(System.in);  
  
  d1 = s.nextDouble();
  c1 = s.nextInt();
  d2 = s.nextDouble();
  c2 = s.nextInt();
    int rem = (c1+c2)/100;
    double tot = d1+d2+ rem;
    System.out.println((int)tot);
    System.out.println((c1+c2)%100);
}
}
