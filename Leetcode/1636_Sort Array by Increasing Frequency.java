import java.util.*;
public class Main{
    
    public static void main (String[] args) {
        int arr[] = {
            -53,-53,52,52,52,52,-53,-53,52,-53,52,52,52,-53,52,52,-53,52,-53,52,-53,52,52,52,52,52,52,52,52,52,-53,52,-53,52,-53,52,52,52,-53,-53,52,-53,52,52,52,52,-53,-53,-53,-53,-53,52,52,-53,52,-53,52,52,52
        };
        HashMap<Integer , Integer> map1 = new HashMap();
        Map<Integer , List<Integer>> map2 = new TreeMap();
        for(int i : arr)
            if(map1.containsKey(i))
                map1.put(i , map1.get(i) + 1);
            else map1.put(i , 1);
        
    
        map1.forEach((k , v)->{
             List<Integer> l = new LinkedList();
            if(!map2.containsKey(v))
            {
                l.add(k);
                map2.put(v , l);
            }
            else {
                l.addAll(map2.get(v));
                l.add(k);
                Collections.sort(l);
                map2.put(v , l);
            }
        });
        int res[] = new int[arr.length];
        int iter[] = {0};
        
        map2.forEach((k , v)->{
            
                    
                for(int i=v.size()-1;i>=0;i--)
                {
                    for(int key=0;key<k;key++)
                    {
                        res[iter[0]] = v.get(i); 
                        iter[0]++;
                    }
                }
                
            
        });
        
    }   
}