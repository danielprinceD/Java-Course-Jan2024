import java.util.Scanner;

public class compatiblility {
    public static void main(String[] args) {
        int size;
        boolean compatible = true;
        Scanner s = new Scanner(System.in);
        size = s.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        for(int i=0;i<size;i++)
            arr1[i] = s.nextInt();
        for(int i=0;i<size;i++){
            arr2[i] = s.nextInt();
            compatible = ( ( arr1[i] >= arr2[i] )  & compatible ) ? true : false;
        }
        if(compatible == true)
            System.out.println("compatible");
        else
            System.out.println("Not compatible");
    }
}
