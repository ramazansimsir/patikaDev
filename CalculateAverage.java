
//  to get input  from user add Scanner class
import java.awt.*;

import java.util.Scanner;
public class CalculateAverage {

    public static void main(String[] args) {

        // create to variable for grades
        int  math=0,physics=0,chemical=0,history=0,turkish=0,music=0;
        Scanner input =new Scanner(System.in);

        System.out.println("Please enter your math exam grade");
        math=input.nextInt();
        System.out.println("Please enter your pyhsics exam grade");
        physics=input.nextInt();
        System.out.println("Please enter your  chemical grade");
        chemical=input.nextInt();
        System.out.println("Please enter your  history exam grade");
        history=input.nextInt();
        System.out.println("Please enter your turkish exam grade");
        turkish=input.nextInt();
        System.out.println("Please enter your music exam grade");
        music=input.nextInt();


        // calculate average
        double average=(math+physics+chemical+history+turkish+music)/6.0;
        // String .format display double in 2  decimal place
        System.out.println("Your average is "+ String.format("%.2f",average));

        String res=(average>=60) ? "You are pass the class" :"You are fail cannot pass class";
        System.out.println(res);


    }





}