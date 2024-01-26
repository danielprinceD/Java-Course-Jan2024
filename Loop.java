import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int num,start=101,flag;
    num  = s.nextInt();
    while(num>0)
      {
        flag = 0;
        for(int i=1;i<=start/2;i++){
          if(start%i == 0){flag++;}
        }
        if(flag==1)
        {System.out.println(start);
        num--;
        }
        start++;
      }
  }
}