import java.util.Scanner;

public class Lucas_Sequence {
    public static void main(String[] args) {
        int num;int arr[] = {0,0,1};
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        System.out.print("0 0 ");
        for(int i=2;i<=num+2;i++)
        {
            arr[i%3]=arr[0]+arr[1]+arr[2];
            System.out.print(arr[i%3]+" ");
        }
    }
}
