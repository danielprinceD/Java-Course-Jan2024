import java.util.Scanner;
class Main{
public static void main(String args[])
{
  Scanner s = new Scanner (System.in);
    int y;
    y = s.nextInt();
    System.out.println( (y/365) + " "+ ((y%365)/7) + " "+ ((y%365)%7));
}
}