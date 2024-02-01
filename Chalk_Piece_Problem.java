import java.util.Scanner;

public class Chalk_Piece_Problem {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        System.out.println("The Number of Days : "+(int)(num + (num/Math.sqrt(num)) + 1) );
    }
}
