package Inheritance;

import java.util.Scanner;

class Account
{
    int AccID;String HolderName;int Balance;
    Account(int id, String name,int bal)
    {
        this.HolderName = name;
        if(id >=100 && id <=999)this.AccID = id;
        else this.AccID = -1;
        if(Balance >=0)this.Balance = bal;
        else this.Balance = 0;
    }

}
class VIPAccount extends Account
{
    int neg_bal;
    VIPAccount(int AccID , String HolderName , int Balance)
    {
        super(AccID, HolderName, Balance);
        Scanner s = new Scanner(System.in);
        int credit=s.nextInt();
        neg_bal = s.nextInt();
        
        System.out.println(Balance);
        setAccountBalance(neg_bal);
    }
    public int credit_amt(int amt)
    {
        super.Balance +=amt;
        return super.Balance;
    }
    
    public void setAccountBalance(int neg)
    {
            System.out.println(super.AccID + " " + super.HolderName + " "+super.Balance);
            System.out.println("The balance can be negative but no less than -10000");
    }
}
public class Bank_Account {
public static void main(String[] args) {
    
    Scanner s = new Scanner( System.in);
    int id = s.nextInt();
    String name = s.next();
    int bal = s.nextInt();
    int credit = s.nextInt();
    int neg = s.nextInt();
    VIPAccount v = new VIPAccount(id,name,bal);
    v.
}
    
}
