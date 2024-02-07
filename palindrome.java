import java.util.Scanner;

public class palindrome {

    static int ans= 0;
    static int reverse(int num)
    {
        if(num == 0)
            return ans;
        if(num > 0)
        {
            
            ans = ans *10 + (num %10);
            reverse(num/10);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int rev = reverse(num);
        System.out.println(rev);
    }
}
