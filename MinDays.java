import java.util.*;
class MinDays
{
    public static void main(String args[])
    {
        int n,rem=0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while(n > 0)
        {
            rem += n%2;
            n/=2;
        }
        System.out.println(rem);
    }
}
