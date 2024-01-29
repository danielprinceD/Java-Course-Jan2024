import java.util.*;
public class Sports_day_celebration
{
	 public static void main (String[] args) {
	 int num,team;
	 Scanner s = new Scanner (System.in);
	 num = s.nextInt();
	 team  = s.nextInt();
	 System.out.print( (num/team)+ " "+ (num%team) );
	}
}
