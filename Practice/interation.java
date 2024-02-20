package Practice;
import java.util.*;

public class interation {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        ArrayList a = new ArrayList();
        Object str = s.next();
        while(!str.equals("-1"))
        {
            a.add(str);
            str = s.next();
        }
        System.out.println(a);
    }
}
