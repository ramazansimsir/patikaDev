import java.util.Scanner;

public class HeatActivity {

    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the heat degree ");
        heat = input.nextInt();

        if (heat <=5 ) {
            System.out.println("you can go to skiing");
        } else if (heat < 15) {
            System.out.println("you can go to the cinema");
        } else if (heat < 25) {
            System.out.println("You can go to  picnic");
        } else {
            System.out.println("You can go to swimming");
        }
    }

}
