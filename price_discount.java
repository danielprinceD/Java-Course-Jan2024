import java.util.*;
public class Main{
  public static void main(String args[])
  {
    double amt;
    int mon;
    Scanner s = new Scanner(System.in);
    amt = s.nextDouble();
    mon = s.nextInt();
    switch(mon){
      case 1:
        amt -= amt*0.2;
        break;
      case 3:
      case 4:
        amt -= amt*0.1;
        break;
      case 6:
      case 7:
        amt -= amt*0.75;
        break;
      case 10:
      case 11:
        amt -= amt*0.3;
        break;
      case 12:
        amt -= amt*0.35;
        break;
    }
    System.out.printf("Chris father needs to pay Rs.%.2f",amt);
  }
}