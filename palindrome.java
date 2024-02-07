import java.util.Scanner;

public class palindrome {

    static int ans= 0;
    static int reverse(int num,int rev)
    {
        return (num == 0)? rev:reverse(num/10, rev*10 + num%10);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int rev = reverse(num,0);
        System.out.println(rev);
    }
}
