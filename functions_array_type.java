import java.util.Scanner;

public class functions_array_type {

    public static void main(String[] args) {
        int num;
        int odd=0,even=0;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        int[] a = new int[num];
        for(int i : a )
        {
            i = s.nextInt();
            if(i%2==0)even++;
            if(i%2!=0)odd++;
        }
        if(odd == 0 && even!=0 )System.out.println("The array is Even");
        if(odd != 0 && even==0 )System.out.println("The Array is Odd");
        if(odd != 0 && even!=0 )System.out.println("The Array is Mixed");
    }
}