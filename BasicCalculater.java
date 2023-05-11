
import  java.util.Scanner;
public class BasicCalculater {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int select;
        int number1;
        int number2;

        System.out.println("Please enter first number");
        number1=scan.nextInt();
        System.out.println("Please enter second number");
        number2=scan.nextInt();

        System.out.println("Press enter 1 for sum");
        System.out.println("Press enter 2 for subtraction");
        System.out.println("Press enter 3 for multiply");
        System.out.println("Press enter 4 for divide ");
        select=scan.nextInt();

        switch (select) {
            case 1 -> System.out.println("Result is " + (number1 + number2));
            case 2 -> System.out.println("Result is " + (number1 > number2 ? number1 - number2 : number2 - number1));
            case 3 -> System.out.println("Result is " + (number1 * number2));
            case 4 -> System.out.println("Result is " + (number1 / number2));
            default -> System.out.println("Invalid choice please try again ");
        }


    }

}
