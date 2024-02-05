import java.util.Scanner;
public class insert_sort {
    static void insertion_sort(int []arr,int n)
    {
        int key,j;
        for(int i=1;i<n;i++)
        {
            key = arr[i];
            j = i-1;
            while(j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key; 
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)arr[i] = s.nextInt();
        insertion_sort(arr,arr.length);
        for(int i : arr)
            System.out.print(i+ " ");
    }
}
