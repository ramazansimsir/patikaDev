
// to get price from user
import  java.util.Scanner;
public class KdvCalculater {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int price;
        System.out.println("Please enter price ");
        price=input.nextInt();
        int kdv=(price<1000) ? 18:8;

        // calculate total price
        double total=price+(price*kdv)/100;

        System.out.println("Total price is " +String.format("%.2f",total));

    }



}
