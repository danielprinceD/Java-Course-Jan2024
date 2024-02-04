import java.util.Scanner;
public class bubble_sort
{
    static void bubble_sorting(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                   {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                   }
            }
        }
        for(int i:arr)
            System.out.print(i+" ");
    }
	public static void main(String[] args) {
	    int arr[] = {4,2,6,9,1};
	    bubble_sorting(arr,arr.length);
	}
}