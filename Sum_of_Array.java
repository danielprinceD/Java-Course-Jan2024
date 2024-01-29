import java.util.Scanner;
class Main
  {
    public static int ans = 0;
    public static int add_rec(int[] a,int s)
    {
      if(s>=0)
      {
        ans +=a[s];
        add_rec(a,s-1);
      }
      return 0;
    }
    public static void main(String args[])
    {
      int size;
      Scanner s = new Scanner(System.in);
      size = s.nextInt();
      int[] arr = new int[size];
      for(int i=0;i<size;i++)
        {
          arr[i] = s.nextInt();
        }
      add_rec(arr,size-1);
      System.out.print(ans);
    }
  }