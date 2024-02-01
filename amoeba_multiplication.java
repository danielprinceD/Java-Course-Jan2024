import java.util.Scanner;

public class amoeba_multiplication {
    
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int a = 0 , b =1;
        for(int i=1;i<num;i++)
        {
            a^=b;
            b^=a;
            a^=b;
            b = a + b;
        }
        System.out.println(a);
    }
}
