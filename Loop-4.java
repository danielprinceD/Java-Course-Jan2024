import java.util.Scanner;
public class Main
{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int num,i=7,j=5,start=1;
    num = s.nextInt();
    while(start <= num ){
      if(start%2!=0)
      {
        System.out.print(i+" ");
        i++;
      }
      if(start%2==0)
      {
        System.out.print(j+ " ");
        j++;
      }
      start++;
    }
  }
  
}