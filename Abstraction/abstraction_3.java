package Abstraction;

import java.util.Scanner;

abstract class AbstractClass
{
    abstract void disivor(int n);
}
class Divisor extends AbstractClass
{   
    void disivor(int n)
    {
        int ans = 0;
        for(int i=1;i<=n;i++)
        {
            ans+=(n%i==0)?i:0;
        }
        System.out.println(ans);
    }
}
public class abstraction_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        AbstractClass div = new Divisor();
        div.disivor(num);
    }
}
