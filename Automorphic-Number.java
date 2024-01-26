import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int num,rem;
      num = s.nextInt();
      rem = (num*num)%10;
      if(num==rem)
        System.out.print("Automorphic Number");
      else
        System.out.print("Not Automorphic Number");
    }
  }