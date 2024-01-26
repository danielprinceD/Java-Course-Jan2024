import java.util.Scanner;
public class Main
{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int num,i=7,j=5;
    num = s.nextInt();
    while(num > 0){
      if(num%2!=0)
      {
        System.out.print(i+" ");
        i++;
      }
      if(num%2==0)
      {
        System.out.print(j+ " ");
        j++;
      }
      num--;
    }
  }
  
}