import java.util.Scanner;
import java.util.Arrays;
public class Main
{
  public static void removeDuplicate(int s,int[] arr)
  {
    int cur = -1;
    for(int i=0;i<s;i++)
      {
        if(cur < arr[i])
        {
          cur = arr[i];
          System.out.print(cur+" ");
        }
      }
  }
  public static void main(String []args)
  {
    int size;
    Scanner s = new Scanner(System.in);
    size = s.nextInt();
    int[] arr = new int[size];
    for(int i=0;i<size;i++)
      {
        arr[i]  =s.nextInt();
      }
    removeDuplicate(size,arr);
    
  }
}