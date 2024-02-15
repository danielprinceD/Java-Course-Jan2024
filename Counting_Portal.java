import java.util.Scanner;

class Count
{
    int num;
    Count(int n)
    {
        this.num = n;
        System.out.println("Count of all digits: "+ counter(num));
    }
    int counter(int n)
    {
        int ans=0;
        while(n>0)
        {
            ans+=1;
            n/=10;
        }
        return ans;
    }
}
public class Counting_Portal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Count obj = new Count(n);
        s.close();
    }
}
