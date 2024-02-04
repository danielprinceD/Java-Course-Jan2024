import java.util.Scanner;

public class sum_of_arr {
    public static void main(String[] args) {
        int size,ans =0;
        Scanner s = new Scanner(System.in);
        size = s.nextInt();
        int arr[]= new int[size];
        for(int i : arr)
        {
            i = s.nextInt();
            ans+=i;
        }
        System.out.println(ans);
    }
}
