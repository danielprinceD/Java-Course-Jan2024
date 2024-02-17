package Inheritance;

import java.util.Scanner;

class Bicycle
{
    String result;
    int gear,speed,height;
}
class MountainBike extends Bicycle
{
    void getData(int gear , int speed ,int height)
    {
        super.gear = gear;
        super.speed = speed;
        super.height = height;
    }
    public String toString()
    {
        super.result = "No of gears are "+gear +"\n"+ "speed of bicycle is "+speed+"\nseat height is "+height; 
        return super.result;
    }
}
public class Bicycle_Portal {
    public static void main(String[] args) {
        MountainBike b = new MountainBike();
        Scanner s = new Scanner(System.in);
        int gear,speed,height;
        gear = s.nextInt();
        speed = s.nextInt();
        height = s.nextInt();
        b.getData(gear, speed, height);
        System.out.println(b.toString());
    }
}
