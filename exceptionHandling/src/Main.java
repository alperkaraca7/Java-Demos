import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);



        try {
            System.out.println("sayi giriniz : ");
            int sayi = scan.nextInt();

            int sonhalisayi = sayi/0;

            System.out.println(sonhalisayi);
        } catch (Exception e) {
            System.out.println("sayi sıfıra bölünmez laa");

        }
        finally {
            System.out.println("bana burda iş yok yinede her türlü çalışıyorum :( ");
        }

        System.out.println("*-****************************-" );

        try {
            int[] sayilar = {1,2,3};
            System.out.println(sayilar[3]);

        } catch (Exception e) {
            System.out.println("hatalı kod :) ");
        }
        finally {

            System.out.println("ben her türlü çalışırım ");
        }


    }
}