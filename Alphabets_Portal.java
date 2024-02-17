import java.util.Scanner;

class Alphabets
{
    public String alph(char alphabet)
    {
        if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u')
        {
            return "vowel";
        }
        return "consonant";
    }
}
public class Alphabets_Portal
{
    public static void main(String[] args) {
        Alphabets a = new Alphabets();
        Scanner s = new Scanner(System.in);
        String alphabet =  s.next();
        System.out.println(alphabet+" :" +a.alph(alphabet.toLowerCase().charAt(0)));
    }
}
