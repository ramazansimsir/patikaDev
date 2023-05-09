

import  java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {

        int r;
        int angle;
        double circleArea;
        double PI=3.14;
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter radius of circle");
        r=input.nextInt();
        System.out.println("Please enter angle of center circle");
        angle=input.nextInt();

        circleArea=(PI*r*r*angle)/360;

        System.out.println("Circle area is " + String.format("%.2f",circleArea));




    }
}
