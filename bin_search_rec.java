import java.util.Scanner;

public class bin_search_rec {
    static boolean binary_rec(int arr[],int start , int end , int key)
    {
        if(start <= end)
        {
            int mid = (start + end)/2;
            if(arr[mid] == key)
                return true;
            else if(arr[mid] > key)
                return binary_rec(arr, start, mid-1, key);
            else if(arr[mid] < key)
                return binary_rec(arr, mid+1, end, key);
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
        boolean isFound = binary_rec(arr,0,size-1,key);
        System.out.println(isFound);
    }
}
