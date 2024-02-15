import java.util.Scanner;

class Fib 
{
    int num;
    Fib(int n)
    {
        this.num = n;
        for(int i=2;i<=n;i++)
        {
            Fibonacci(i);
            
        }
    }
    void  Fibonacci(int n)
    {
        int j =0,k=1;
        while(j <= n)
        {
            int temp = j;
            j = k; k = k+temp;
            if(j==n){
                System.out.println( (int)Math.floor(j) + " is a fibonacci number ");
                powerOfTwo(n);
            }
        }
    }
    void powerOfTwo(int n){
        for(int i=1;i<=n;i++)
        {
            if(n == power(i))
            {
                System.out.println((int)Math.ceil(n) + " is a power of two");   
            }
        }
    }
    int power(int i)
    {
        if(i==0)return 1;
        return 2 * power(i-1);
    }

}
public class Fibonacci_Portal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Fib fib = new Fib(n);
    }
}
