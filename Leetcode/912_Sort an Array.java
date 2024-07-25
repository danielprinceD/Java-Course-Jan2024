class Solution {
    private static void swap(int arr[] , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static int medianOfThree(int arr[], int start, int end) {
        int mid = start + (end - start) / 2;
        if (arr[start] > arr[mid]) swap(arr, start, mid);
        if (arr[start] > arr[end]) swap(arr, start, end);
        if (arr[mid] > arr[end]) swap(arr, mid, end);
        return mid;
    }
    private static int partition(int arr[] , int start , int end)
    {
        int median = medianOfThree(arr, start, end);
        swap(arr, median, end);
        int pi = start -1 , pivot = arr[end];
        for(int i=start;i<=end;i++)
            if(arr[i] < pivot)
                swap(arr , i , ++pi);
        swap(arr , ++pi , end);
        return pi;
    }
    private static void quicksort(int arr[] , int start , int end)
    {
        if(start <= end){
            int pivot = partition(arr , start , end);
            quicksort(arr , start , pivot-1 );
            quicksort(arr , pivot+1 , end );
        }
    }
    
    public int[] sortArray(int[] nums) {
        quicksort(nums , 0 , nums.length -1);
        return nums;
    }
}
public class Main
{
	public static void main(String[] args) {
		int []nums = {1 , 2 , 9 ,3 ,6};
		Solution s = new Solution();
		for(int i : s.sortArray(nums))
		    System.out.print(i + " ");
		    
	}
}