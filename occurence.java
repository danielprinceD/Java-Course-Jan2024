public class occurence {
    
    static int reccurrsion(int arr[] , int i,int num)
    {
        if(i > arr.length)return 0;
        if(arr.length > i && arr[i] == num) return 1 + reccurrsion(arr, i+1, num);
        return reccurrsion(arr, i+1, num);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,2,6,9};
        System.out.println(reccurrsion(arr,0,2));   
    }
}
