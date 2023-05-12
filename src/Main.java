import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int matematik, kimya , fizik, resim, muzik;
        System.out.println("Not ortalaması hesaplama");

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        matematik=input.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya=input.nextInt();

        System.out.println("Fizik notunu giriniz: ");
        fizik=input.nextInt();

        System.out.println("Resim notunu giriniz: ");
        resim=input.nextInt();

        System.out.println("Muzik notunu giriniz: ");
        muzik=input.nextInt();

        int top=matematik+ kimya+ fizik+ resim+ muzik;
        double sonuc= top/5;


        System.out.println("Ortalamanız "+ sonuc+"'dır");
        System.out.println(sonuc>60 ? "Sınıfı Geçtiniz":"Sınıfta Kaldınız");
    }
}