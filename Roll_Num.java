import java.util.Scanner;
class Student
{    
  int roll,mark1,mark2,mark3,tot=0;    
  static int h_tot=0,h_roll=0,m1_roll=0,m2_roll=0,m3_roll=0, first_m1=0, first_m2=0,first_m3=0;      
    public void setMark1(int m1)
      {
      this.mark1 = m1;
      }
  public void setMark2(int m2)
  {
    this.mark2 = m2; 
  }
  public void setMark3(int m3)
  {
    this.mark3 = m3;
  }
  void calculate()
  { 
    this.tot = mark1 + mark2 + mark3; 

    if(h_tot < tot)
    {
        h_tot = tot;h_roll = roll;
    }  
    if(mark1 > first_m1)      
    {           
      first_m1 = mark1;    
      m1_roll = roll;  
    }        
    if(mark2 > first_m2)     
    {           
      first_m2 = mark2;  
      m2_roll = roll;     
    }       
    if(mark3 > first_m3)   
    {          
      first_m3 = mark3;  
      m3_roll = roll;  
    } 
  }
  
  
}
public class Roll_Num { 
  public static void main(String[] args) {   
    Scanner sc = new Scanner(System.in);  
    int n = sc.nextInt();     
    int m1,m2,m3;
    Student []s = new Student[n];   
    for(int i=0;i<n;i++)    
      {
        s[i] = new Student();
        s[i].roll = sc.nextInt();
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        s[i].setMark1(m1);
        s[i].setMark2(m2);
        s[i].setMark3(m3);
        s[i].calculate();
      }
          
    for(int i=0;i<n;i++)System.out.println(s[i].tot);
    System.out.println(Student.m1_roll + " " +  Student.first_m1 );
    System.out.println(Student.m2_roll +" " +  Student.first_m2 );  
    System.out.println(Student.m3_roll + " " + Student.first_m3 );   
    System.out.println( Student.h_roll + " " +Student.h_tot);   
  }
}