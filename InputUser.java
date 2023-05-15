
import java.util.Scanner;
public class InputUser {


    public static void main(String[] args) {

        String userName,password;
        Scanner scan =new Scanner(System.in);

        System.out.println("Please enter your user name");
        userName=scan.nextLine();
        System.out.println("Please enter your password");
        password=scan.nextLine();

        if(userName.equals("Patika") && password.equals("java1234")){
            System.out.println("Sisteme giris yaptiniz ");

        }
        else{
            System.out.println("Bilgileriniz yanlis ");

            System.out.println("Sifrenizi sifirlamak ister misiniz  evet veya hayir ");
            String answer= scan.nextLine();
            String newPassword;
            if(answer.equals("evet")){
                System.out.println("Yeni sifrenizinizi girin ");
                newPassword=scan.nextLine();
                if(newPassword.equals(password)){
                System.out.println("hatali sifre ile yeni sifre ayni olamaz");
                }
                else if(newPassword.equals("java1234")){
                    System.out.println("eski sifre ile yeni sifre ayni olamaz");
                }
                else {
                    System.out.println("basariyla yeni sifre olusturuldu ");
                }


            }
            else {
                System.out.println("programdan cikiliyor");

            }

        }


    }



}
