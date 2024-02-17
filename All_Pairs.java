import java.util.Scanner;

class Pairs
{
    int num,pair_num;
    void pairs()
    {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[num];
        for(int i=0;i<num;i++)
            arr[i] = s.nextInt();
        pair_num = s.nextInt();
        print(arr , pair_num);
    }
    void print(int arr[], int p)
    {
        for(int i=0;i<num;i++)
        {
            for(int j=i;j<num;j++)
            {
                if(arr[i] + arr[j] == p)
                    System.out.println(arr[i] + " " +arr[j]);
            }
        }
    }
}
public class All_Pairs {
    public static void main(String[] args) {
        Pairs p = new Pairs();
        Scanner s = new Scanner(System.in);
        p.num = s.nextInt();
        p.pairs();
    }
}
