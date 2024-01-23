import java.util.Scanner;
class Main{
 public static void main(String args[]) 
{
    double r,h,hr,tot;
    Scanner s = new Scanner(System.in);
    r = s.nextDouble();
    h = s.nextDouble();
    hr = s.nextDouble();
    tot = s.nextDouble();
    double area = 3.14*r*r*h;
    if(area < tot*hr)
    {
    System.out.print("The tank can be filled within "+tot+" hours");
        
    }
    else
    {
    System.out.print("The tank cannot be filled within "+tot+" hours");

    }
    
}

}