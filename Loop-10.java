import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int num,i=0,j=0;
    num  = s.nextInt();
    while(num>0)
      {
        i +=j;
        System.out.print(i+" ");
        j +=2;
        num--;
      }
  }
}