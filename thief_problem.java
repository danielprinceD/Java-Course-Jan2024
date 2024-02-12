import java.util.*;
public class thief_problem {

  static int thief(int arr[],int n)
  {
    if(n < 0)return 0;
    return Math.max(thief(arr,n-1) ,arr[n] + thief(arr,n-2));
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    for(int i=0;i<size;i++)
      arr[i] = sc.nextInt();
    System.out.println(thief(arr,size-1));
  }
}

