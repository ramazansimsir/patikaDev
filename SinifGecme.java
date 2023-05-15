import java.util.Scanner;

public class SinifGecme {
    public class SinifiGecmeDurumu {
        public static void main(String[] args) {
            int matematik, fizik, turkce, kimya, muzik, count=0;
            double ortalama, toplam=0.0;
            Scanner scanner=new Scanner(System.in);


            System.out.println("Matematik notunuzu giriniz:");
            matematik=scanner.nextInt();
            if(matematik>=0 && matematik<=100){
                toplam+=matematik;
                count++;
            }else{
                System.out.println("Matematik notu gecersiz");
            }
            System.out.println("Fizik notunuzu giriniz:");
            fizik=scanner.nextInt();
            if(fizik>=0 && fizik<=100){
                toplam+=fizik;
                count++;
            }else{
                System.out.println("Fizik notu gecersiz");
            }
            System.out.println("Turkce notunuzu giriniz:");
            turkce=scanner.nextInt();
            if(turkce>=0 && turkce<=100){
                toplam+=turkce;
                count++;
            }else{
                System.out.println("Turkce notu gecersiz");
            }
            System.out.println("Kimya notunuzu giriniz:");
            kimya=scanner.nextInt();
            if(kimya>=0 && kimya<=100){
                toplam+=kimya;
                count++;
            }else{
                System.out.println("Kimya notu gecersiz");
            }
            System.out.println("Muzik notunuzu giriniz:");
            muzik=scanner.nextInt();
            if(muzik>=0 && muzik<=100){
                toplam+= muzik;
                count++;
            }else{
                System.out.println("Muzik notu gecersiz");
            }
            if(count>0){
                ortalama=toplam/count;
                System.out.println("Ortalama:"+ortalama);
                if(ortalama<=55){
                    System.out.println("Sinifta Kaldiniz!");
                }else{
                    System.out.println("Tebrikler, Sinifi Gectiniz!");
                }
            }else{
                System.out.println("Girilen notlar gecersiz");
            }

        }
    }
}
