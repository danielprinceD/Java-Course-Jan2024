import java.util.Scanner;

public class no_dice {
    static void dice(int start , int end,String ans)
    {
        
        if(start == end)System.out.println(ans);
        if(start > end)return;
        dice(start+1,end,ans+"1");
        dice(start+2,end,ans+"2");
        dice(start+3,end,ans+"3");
        dice(start+4,end,ans+"4");
        dice(start+5,end,ans+"5");
        dice(start+6,end,ans+"6");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dice_roll = s.nextInt();
        dice(0,dice_roll,"");
    }  
}
