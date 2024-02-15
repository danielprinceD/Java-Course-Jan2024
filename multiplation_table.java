import java.util.Scanner;

class multiplationGame
{
    multiplationGame()
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(num + " " + game(num)+ " wins");
    }
    String game(int num)
    {
        int i=1,j=1;
        String win="";
        while(num > 0)
        {
            if(i%2!=0)
            {
                j*=i;
                num-=j;win = "John";
            }
            if(i%2==0)
            {
                j*=i;
                num-=j;win = "Michael";
                
            }
            i++;
        }
        return win;
    } 
}
public class multiplation_table {
    public static void main(String[] args) {
        multiplationGame ob = new multiplationGame();
    }
}
