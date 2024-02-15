import java.util.Scanner;
class BMI
{
    float height;int weight;double index;String str;
    void bmi(int W , float L)
    {
        this.height = L;
        this.weight = W;
        this.index = weight / (height * height);
    }
    public String result()
    {
        if(index < 18.5) str = "U";
        else if(index >= 18.5 && index < 25.0)str= "N";
        else if(index >= 25.0 && index < 30.0)str = "H";
        else if(index > 30.0) str = "O";
        return str; 
    }
}
public class BMI_Portal {
    public static void main(String[] args) {
        BMI bm = new BMI();
        Scanner s = new Scanner(System.in);
        int W = s.nextInt();
        float L = s.nextFloat();
        bm.bmi(W,L);
        System.out.println(bm.result());
    }
}
