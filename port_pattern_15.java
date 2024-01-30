import java.util.Scanner;

public class port_pattern_15 {
    public static void main(String args[])
{

    int num,val = 2;
    Scanner s = new Scanner(System.in);
    num = s.nextInt();
    int[] arr = new int[num];
    arr[0] = val;
    int pos=0;
    int i=1 , flag = 0,prime = 2;
    while(i <=  num)
    {
        flag = 0;
        for(int j = 1;j<= prime/2;j++)
        {
            if(prime%j == 0)
                flag++;
        }
        if(flag == 1) {arr[pos] = prime;pos++;
        i++; }
        prime ++;
    }
    for(int j=0; j<num;j++)
    {
        for(int k=0; k<=j;k++)
        {System.out.print(arr[k]);}
        
        System.out.println();
    }
}
}
