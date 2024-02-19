package Abstraction;

import java.util.Scanner;

abstract class marks
{
   abstract void getPercentage();
}
class A extends marks
{
    double marks1 , marks2, marks3;
    double percentA;
    void getPercentage()
    {
        percentA = ((marks1 + marks2 + marks3)/3);
        System.out.printf("%.2f\n" , percentA);
    }
    A(double m1,double m2,double m3)
    {
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }
}
class B extends A
{
    double mark4,percentB;
    void getPercentage()
    {
        percentB = (marks1 + marks2 + marks3 + mark4)/4;
        System.out.printf("%.2f" , percentB);
    }
    B(double a,double b,double c , double d)
    {
        super(a,b,c);
        this.mark4 = d;
    }
}
public class abstraction_2 {
    public static void main(String[] args) {
        double m1,m2,m3,m4;
        Scanner s = new Scanner(System.in);
        m1=s.nextDouble();
        m2=s.nextDouble();
        m3=s.nextDouble();
        marks a = new A(m1,m2,m3);
        m1=s.nextDouble();
        m2=s.nextDouble();
        m3=s.nextDouble();
        m4=s.nextDouble();
        marks b = new B(m1 , m2 , m3,m4);
        a.getPercentage();
        b.getPercentage();
    }
}
