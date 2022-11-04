import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList sayilar = new ArrayList();

        sayilar.add(45);

        System.out.println(sayilar.size());
        sayilar.add("ankara");

        System.out.println(sayilar);

        sayilar.set(0,60);
        System.out.println(sayilar.get(0));
        sayilar.remove(1);
        System.out.println(sayilar);

        for (Object a:sayilar) {
            System.out.println(a);

            ArrayList<String> sehirler = new ArrayList<String>();

            sehirler.add("antalya");
            sehirler.remove(0);
            System.out.println(sehirler);


        }
    }
}