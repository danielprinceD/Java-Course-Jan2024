import java.util.*;

class Rect
{
  double len,bre;
  Rect()
  {
    Scanner s = new Scanner(System.in);
    this.len = s.nextDouble();
    this.bre = s.nextDouble();
  }
  void display(){
    System.out.println("---------------------------------");
    System.out.println("The area of the rectangle is "+len*bre);
    System.out.println("The perimeter of the rectangle is "+2 * (len + bre));
}
}

public class Rectangle_portal
{
  public static void main(String []args)
  {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    Rect r[] = new Rect[num];
    for(int i=0;i<num;i++)
      r[i] = new Rect();
    for(int i=0;i<num;i++)
      r[i].display();
  }
}