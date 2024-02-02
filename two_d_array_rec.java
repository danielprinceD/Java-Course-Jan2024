public class two_d_array_rec {
    static int ways(int[] a , int pos )
    {
        int val = 0;
        if(pos == 0)
            return a[0];
        if(pos < 0)
            return val;
        val += ways(a, pos-2);
        return val;
        
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int pos = a.length;
        ways(a , pos-1);
    }
}
