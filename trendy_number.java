import java.util.Scanner;

public class trendy_number {
    public static void main(String[] args) {
        int num,i=0,val=0;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        while(num > 0)
        {
            if(i==1)val+=num%10;
            num/=10;
            i++;
        }
        if(i==3 && val%3 == 0)
            System.out.println("Trendy Number");
        else
            System.out.println("Not trendy Number");
    }
}
