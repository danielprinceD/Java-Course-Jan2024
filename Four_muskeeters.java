import java.util.*;
public class Four_muskeeters
{
	public static void main(String[] args) {
	   double x1,x2,x3,y1,y2,y3;
	   double X,Y;
	   Scanner s = new Scanner(System.in);
	   x1 = s.nextDouble();
	   y1 = s.nextDouble();
	   x2 = s.nextDouble();
	   y2 = s.nextDouble();
	   x3 = s.nextDouble();
	   y3 = s.nextDouble();
	   X = (x1+x2+x3)/3;
	   Y = (y1+y2+y3)/3;
	    System.out.printf( "%.1f %.1f",X,Y);
	   
	}
}
