import java.util.Arrays;
import java.util.Scanner;

public class search_element {

    static boolean check(int arr[],int ele)
    {
        for(int i : arr)
            if(i == ele)
                return true;
        
        return false;
    }
    public static void main(String[] args) {
        int size;
        Scanner s = new Scanner(System.in);
        size = s.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = s.nextInt();
        int ele = s.nextInt();
        boolean present = check(arr,ele);
        if(present == false)
            System.out.println(ele + " not present in array");
        else
            System.out.println(ele + " present in array");
    }
}
