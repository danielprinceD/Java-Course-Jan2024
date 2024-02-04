import java.util.Arrays;
import java.util.Scanner;

public class distinct_array {

    static boolean check(int[] arr , int val)
    {
        for(int i : arr)
        {
            if(i == val)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        num = s.nextInt(); int val = 0;
        int[] ip_arr = new int [num];
        
        for(int i = 0;i<num;i++)ip_arr[i] = s.nextInt();
        boolean present;

        int[] arr = new int[15];
        for(int i=0;i<arr.length;i++)arr[i] = -1;
        int pos = 0;int zeros = 0,ans=0;
        for(int i=0;i<num;i++)
        {
            pos = 0;
            val = ip_arr[i];
            while(val > 0)
            {
                pos++;
                val /=10;
            }
            present = check(arr,pos);
            if(present == false){arr[i] = pos;ans+=arr[i]; }
        }
        System.out.println(ans + " is present in the array");
        
    }
}
