package Projects.hafta0;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        double mat, fizik, kimya, turkce, muzik, sum = 0, count = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen matematik notunuzu giriniz: ");
        mat = input.nextDouble();
        if (mat > 0 && mat < 100) {
            sum += mat;
            count++;
        }
        System.out.print("Lütfen fizik notunuzu giriniz: ");
        fizik = input.nextDouble();
        if (fizik > 0 && fizik < 100) {
            sum += fizik;
            count++;
        }
        System.out.print("Lütfen kimya notunuzu giriniz: ");
        kimya = input.nextDouble();
        if (kimya > 0 && kimya < 100) {
            sum += kimya;
            count++;
        }
        System.out.print("Lütfen türkçe notunuzu giriniz: ");
        turkce = input.nextDouble();
        if (turkce > 0 && turkce < 100) {
            sum += turkce;
            count++;
        }
        System.out.print("Lütfen müzik notunuzu giriniz: ");
        muzik = input.nextDouble();
        if (muzik > 0 && muzik < 100) {
            sum += muzik;
            count++;
        }
        double avarage = sum / count;
        System.out.println("Ortalamanız: " + avarage);
        if (avarage < 55)
            System.out.println("Sınıfta kaldınız");
        else
            System.out.println("Sınıfı geçtiniz.Tebrikler");

    }
}
