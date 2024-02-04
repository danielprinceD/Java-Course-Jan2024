public class insert_sort {
    static void insertion_sort(int []arr,int n)
    {
        int key,j;
        for(int i=0;i<n;i++)
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
        int arr[] = {2,4,8,2,6,3};
        insertion_sort(arr,arr.length);
        for(int i : arr)
            System.out.print(i+ " ");
    }
}
