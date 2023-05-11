
import java.util.Scanner;
public class GreenGrocer {
    public static void main(String[] args) {

        int manyPeer,manyApple,manyTomato,manyBanana,manyEggplant;
        double peer=2.14,apple=3.67,tomato=1.11,banana=0.95,eggplant=5.00;
        Scanner input =new Scanner(System.in);

        System.out.println("How many kilogram of peers did you buy ");
        manyPeer= input.nextInt();
        System.out.println("How many kilogram of apples did you buy ");
        manyApple= input.nextInt();
        System.out.println("How many kilogram of tomatoes did you buy ");
        manyTomato= input.nextInt();
        System.out.println("How many kilogram of bananas did you buy ");
        manyBanana= input.nextInt();
        System.out.println("How many kilogram of eggplants did you buy ");
        manyEggplant= input.nextInt();

        double totalPrice=(manyApple*apple)+(manyBanana*banana)+(manyEggplant*eggplant)+(manyPeer*peer)+(manyTomato*tomato);

        System.out.println("Total price is "+ String.format("%.2f",totalPrice));





    }
}
