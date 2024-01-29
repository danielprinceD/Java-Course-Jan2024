import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int num,j;
    num  = s.nextInt();
    for(int i=1;i<=num;i++)
      {
        if(i%2==0){
          j=(int)Math.pow(i,2);
        System.out.print(j+" ");
        }
        if(i%2!=0){
          j=(int)Math.pow(i,3);
        System.out.print(j+" ");
        }
      }
  }
}