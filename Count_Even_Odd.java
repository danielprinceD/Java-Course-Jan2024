import java.util.*;
public class Main
  {
 public static int countEven(int c,int[] arr)
   {
   int count=0;
     for(int i=0;i<c;i++)
       {
         if(arr[i]%2==0)
         {
           count++;
         }
       }
   return count;
   }
  public static int countOdd(int c,int[] arr)
   {
   int count=0;
     for(int i=0;i<c;i++)
       {
         if(arr[i]%2!=0)
         {
           count++;
         }
       }
   return count;
    
    }
  public static void main(String[] args)
    {
    int size;
    Scanner s = new Scanner(System.in);
    size = s.nextInt();
    int[] arr= new int[size];
    for(int i=0;i<size;i++)
      {
        arr[i] = s.nextInt();
      }
    System.out.println("Odd: "+countOdd(size,arr));
    System.out.println("Even: "+countEven(size,arr));
    }
  }