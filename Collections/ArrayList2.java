import java.util.*;
public class Main
{
  public static void main(String []args)
  {
    Scanner s = new Scanner(System.in);
    ArrayList<Integer> al = new ArrayList<Integer>();
    int size = s.nextInt();
    al.add(s.nextInt());
    int j=1;
    for(int i=1;i<size;i++)
      {
        int temp = s.nextInt();
        if(temp > al.get(j-1))
        {
          al.add(temp);j++;
        }
      }
    
    System.out.println(al);
  }
}