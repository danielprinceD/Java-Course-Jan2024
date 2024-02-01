import java.util.Scanner;
public class abundant_number {
    public static void main(String[] args) {
        int num,div=0;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        for(int i=1 ; i <= num/2;i++)
            if(num %i==0)div+=i;
        if(div > num)
            System.err.println("Abundant Number");
        else
            System.err.println("Not Abundant Number");
    }
}
