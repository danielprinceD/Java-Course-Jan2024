import java.util.Scanner;
public class Main
{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int num,cur=1,j=2,em;
    num = s.nextInt();
    while(num>0){
      System.out.print( cur+" ");
      em = j;
      j += cur;
      cur = em;
      num--;
    }
    
    }
  
}