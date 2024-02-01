import java.util.Scanner;

public class Friendly_Pair {
    public static void main(String[] args) {
        int num1,num2,div1=0,div2=0;
        Scanner s = new Scanner(System.in);
        num1 = s.nextInt();
        num2 = s.nextInt();
        for(int i=1 ; i <= num1/2;i++)
            if(num1 %i==0)div1+=i;
        for(int i=1 ; i <= num2/2;i++)
            if(num2 %i==0)div2+=i;
        if(div1/num1 == div2/num2)
            System.out.println("Friendly Pair");
        else
            System.out.println("Friendly Pair");
    }
}
