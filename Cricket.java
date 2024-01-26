import java.util.*;
public class Main
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int no_b;double no_r,no_rs;
      double no_bb;
      no_b = s.nextInt();
      no_r = s.nextInt();
      no_rs = s.nextInt();
      no_bb = s.nextInt();
      int no_overs;
      double o_fin,run_r,cur_run_r;
      no_overs = no_b/6;
      o_fin = (int)(no_bb/6)+ (no_bb%6)/10;
      cur_run_r = no_rs/o_fin;
      run_r = no_r/no_overs;
      System.out.printf("%d %.1f %.1f %.1f ",no_overs,o_fin,cur_run_r,run_r);
      if(cur_run_r >= run_r)
        System.out.print("Eligible to Win");
      else  
        System.out.print("Not Eligible to Win");
      
    }
  }