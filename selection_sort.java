import java.util.Scanner;

class selection_sort
{
    static void swap(int[] arr,int i,int min)
    {
        int t=arr[i];arr[i] = arr[min];arr[min] = t;
    }
    static void selection_sorting(int[] arr, int n)
    {
        int min;
        for(int i=0 ; i<n; i++)
        {
            min = i;
            for(int j=i+1;j<n;j++)
                if(arr[j] < arr[min])
                    min = j;
            swap(arr,i,min);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = s.nextInt();
        selection_sorting(arr,arr.length);
        for(int i : arr)
            System.out.print(i + " " );
    }
}