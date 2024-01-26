import java.util.Scanner;
public class Main
{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int num,cur=6,j=1,k=2;
    num = s.nextInt();
    while(num>0){
      j = j + k;
      System.out.print( cur+" ");
      cur += j;
      num--;
    }
    
    }
  
}
