import java.util.Scanner;

public class factorial_num {
    public static void main(String[] args) {
        int num,fact = 1,start = 1;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        while(num > fact)
        {
            fact++;
            if(num == start)
            {
                System.out.println("Yes");return;
            }
         start *= fact;
        }
        System.out.println("No");
    }
}
