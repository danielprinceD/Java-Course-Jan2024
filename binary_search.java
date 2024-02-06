import java.util.Scanner;

public class binary_search {

  static int binary(int arr[] ,int start,int end,int ele)
  {
    if(start <= end)
    {
      int mid = (start + end)/2;
      if(arr[mid] > ele)
        return binary(arr,start,mid,ele);
      else if(arr[mid] < ele)
        return binary(arr,mid+1,end,ele);
      else 
        return mid;
    }
    return -1;
}
  public static void main(String []args)
  {
    Scanner s = new Scanner(System.in);
    int size = s.nextInt();
    int arr[]= new int[size];
    for(int i=0;i<size;i++)
      arr[i] = s.nextInt();
    int ele = s.nextInt();
    System.out.print(binary(arr,0,size-1,ele));
    
  }
}

