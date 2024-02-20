import java.util.Scanner;

class Vehicle
{
  void move(String str)
  {
    System.out.println(str);
  }
}
class Motorbike extends Vehicle
{
  void move(String s)
  {
    System.out.println(s);
  }
}
public class Main
{

  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    Vehicle v = new Vehicle();
    Motorbike mb = new Motorbike();
    String a = s.nextLine();
    String b = s.nextLine();
    v.move(b);
    mb.move(a);
  }
}