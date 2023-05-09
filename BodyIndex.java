
import java.util.Scanner;
public class BodyIndex {

    public static void main(String[] args) {

        int weight;
        double height,bodyIndex;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your height metre type please");
        height=input.nextDouble();
        System.out.println("Please enter your weight kg type please ");
        weight=input.nextInt();
        bodyIndex=weight/(height*height);
        System.out.println("Body mass index is " +bodyIndex);



    }
}
