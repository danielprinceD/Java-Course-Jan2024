import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int num,i=0,j=1,k=2;
    num  = s.nextInt();
    while(num >0){
      System.out.print(i + " " );
      j +=k;
      i += j;
      num--;
    }
  }
}