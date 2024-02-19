package Polymorphism;

import java.util.Scanner;

class Overload
{
    int arr[];
    int ans;
    Overload(int a,Scanner s)
    {
        arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i] = s.nextInt();
            ans+=arr[i];
        }
        System.out.println(ans);
    }
}
public class method_overload {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n>3)System.out.println("WRONG INPUT");
        else new Overload(n,s);
    }
}
