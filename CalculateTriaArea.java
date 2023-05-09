
// to get triangle's side from user
import  java.util.Scanner;
public class CalculateTriaArea {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int side1,side2,side3;
        System.out.println("Please enter side1");
        side1=input.nextInt();
        System.out.println("Please enter side2");
        side2=input.nextInt();
        System.out.println("Please enter side3");
        side3=input.nextInt();

        // This is heron formula .We use heron formula for calculate triangle's area.

        int u =(side1+side2+side3)/2;
        // we use  math.sqrt method for calculate square root of value
        double area=Math.sqrt(u*(u-side1)*(u-side2)*(u-side3));

        System.out.println("Triangle area is "+ String.format("%.2f",area));

    }

}
