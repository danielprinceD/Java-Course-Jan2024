package Practice;
import java.util.*;
public class hash {
    public static void main(String[] args) {
        LinkedList l = new LinkedList<>();
        ArrayList a = new ArrayList<>();
        l.add(10);l.add(20);l.add(30);
        a.add(50);a.add(60);a.add(70);
        
        Object ind_l = l.get(0).hashCode();
       

        System.out.println(l.hashCode());
        System.out.println(a.hashCode());

        a.remove(0);
        l.remove(0);

        System.out.println(l.hashCode());
        System.out.println(VM.current().addressOf(l));
    }
}