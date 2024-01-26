import java.util.*;
public class Main
  {

    public static int sumPositive(int size,int[] arr)
    {
      Scanner s = new Scanner(System.in);
      int ans  = 0;
      for(int i=0;i<size;i++)
        {
            arr[i] = s.nextInt();
            while(arr[i] > 0)
              {
                ans += arr[i]%2;
                arr[i] /= 2;
              }
        }
        return ans;
    }
    
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int size;
      size = s.nextInt();
      int[] arr = new int[size];
      
      System.out.print(sumPositive(size,arr));
    }
  }