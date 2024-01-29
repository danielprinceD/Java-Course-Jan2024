import java.util.*;
public class cricket_stadium
{
	 public static void main (String[] args) {
	 int len ,bre,area,peri;
	 Scanner s = new Scanner(System.in);
	 len = s.nextInt();
	 bre = s.nextInt();
	 peri = 2 * (len+bre);
	 area = len * bre;
	 System.out.print(peri + " "+ area );
	}
}
