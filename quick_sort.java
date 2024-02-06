import java.util.Scanner;

public class quick_sort {
    static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int arr[],int start , int end)
    {
        int pivot = arr[end];
        int pivot_index = -1;
        for(int i=0;i<arr.length;i++)
        {
            if( arr[i] < pivot)
                swap(arr, i, ++pivot_index);
        }
        swap(arr,++pivot_index,end);
        return pivot_index;
    }

    static void quick_sorting(int arr[],int start,int end)
    {
        if(start < end )
        {
            int part = partition(arr, start, end);
            quick_sorting(arr, start, part-1); 
            quick_sorting(arr, part+1, end); 
        }
    }

    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int size = s.nextInt();;
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = s.nextInt();
        quick_sorting(arr,0,arr.length-1);
        for(int i:arr)
            System.out.print(i+" ");
    }
}
