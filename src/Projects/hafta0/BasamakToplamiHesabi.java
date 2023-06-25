package Projects.hafta0;

import java.util.Scanner;

public class BasamakToplamiHesabi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        int tempSayi = sayi;

        while (tempSayi != 0) {
            int basamak = tempSayi % 10;
            toplam += basamak;
            tempSayi /= 10;
        }

        System.out.println("Basamakların toplamı: " + toplam);
    }
}
