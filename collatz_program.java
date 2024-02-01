import java.util.Scanner;

public class collatz_program {
    public static void main(String[] args) {
        int num,i=1,count=0;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        System.err.print(num + " ");
        while(num > 1)
        {
            if(num%2 == 0)
            {
                num/=2;
                System.err.print(num + " "); count++;
                continue;
            }
            if(num%2 !=0)
            {
                num = 3*num + 1;
                System.err.print(num + " ");count++;
                continue;
            }
        }
        System.out.print(count);
    }
}
