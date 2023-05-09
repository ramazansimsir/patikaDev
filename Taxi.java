
// to get km from passenger
import java.util.Scanner;
public class Taxi {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int km;
        double perKm=2.20;
        double total=10;
        System.out.println("How many km did you go ");
        km=input.nextInt();
        total+=(km*perKm);
        total=(total<20)?20:total;
        System.out.println("Total price : " + String.format("%.2f",total));




    }


}
