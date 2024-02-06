import java.util.Scanner;

public class merge_sort {
    static void merger(int[] arr, int start, int mid,int end)
    {
        int ls = mid - start+1,rs = end-mid;
        int[] la = new int[ls]; 
        int[] ra = new int[rs];
        for(int i=0;i<ls;i++)
            la[i] = arr[i + start];
        for(int j=0;j<rs;j++)
            ra[j] = arr[mid +1 + j];
        int a=0,b=0,k=start;
        while(a<ls && b<rs)
        {
            if(la[a] < ra[b])
                arr[k++] = la[a++];
           else
                arr[k++] = ra[b++];
        }
        while(a < ls)arr[k++] = la[a++];
        while(b < rs)arr[k++] = ra[b++];         
    }
    static void merge_sorting(int arr[] , int start , int end)
    {
        if(start < end)
        {
            int mid =(end+start)/2;
            merge_sorting(arr , start , mid);
            merge_sorting(arr , mid+1 , end);
            merger(arr,start,mid,end);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = s.nextInt();
        merge_sorting(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}
