import java.util.Arrays;
import java.util.Scanner;

public class binary_search_for_loop {
    static boolean binary(int[] arr , int key)
    {
        int start = 0,end = arr.length;
        while(start <= end)
        {
                int mid  = (start + end)/2;
                if( arr[mid] == key)
                    return true;
                else if(key < arr[mid])
                end = mid - 1;
                else if(key > arr[mid])
                start = mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = s.nextInt();
        int key = s.nextInt();
        System.out.println(binary(arr, key));
        
    }
}
