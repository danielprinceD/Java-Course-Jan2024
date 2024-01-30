import java.util.Scanner;
class stock_sell_profit
  {
    public static void main(String[] args)
    {
      int[] arr ={ 1,10,1,10,3,7};
      int val = 0;
      for( int i=0 ;i< arr.length-1;i++)
      {
        if(arr[i] < arr[i+1])
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j-1] > arr[j] )
                {
                    val += (arr[j-1] - arr[i]);
                    i = j-1;
                    break;
                }
                if(j == arr.length-1)
                    {val += (arr[j] - arr[i]); break;}


            }
        }
    }
    System.out.println(val); 
    }
  }