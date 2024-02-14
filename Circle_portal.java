import java.util.Scanner;
class Circle_P
{
  double rad ,area,circum;
  Circle_P(double rad)
  {
    this.rad = rad;
    area = Math.PI * rad * rad;
    circum = 2 * Math.PI * rad;
  }
  void display_res()
  {
    System.out.println("Radius of the circle is "+ (int)this.rad);
    System.out.println("The area of the circle is "+this.area);
    System.out.println("The circumference of the circle is "+this.circum);
  }
}
public class Circle_portal
{
  public static void main(String []args)
  {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    Circle_P c[] ;
    c = new Circle_P[num];

    for(int i=0;i<num;i++)
    {
       double rad = s.nextDouble();
        c[i] = new Circle_P(rad);

    }
    
    for(int i=0;i<num;i++)
      c[i].display_res();
    s.close();
  }
}