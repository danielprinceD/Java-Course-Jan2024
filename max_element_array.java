import java.util.Scanner;

public class max_element_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int max = 0;
        int[] a = new int[num];
        for(int i : a)
        {
            i = s.nextInt();
            max = Math.max(max, i);
        }
        System.out.println(max);

    }
}
