package Projects.hafta0;

import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args) {
        double kdvOrani;
        int sayi;

        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen para tutarını giriniz: ");
        sayi= input.nextInt();
        kdvOrani= sayi>1000 ? 0.8 : 0.18;
        double kdvTutar=sayi*kdvOrani;
        double kdvliTutar= sayi+kdvTutar;

        System.out.println("Tutar: "+sayi);
        System.out.println("KDV Oranı: "+kdvOrani);
        System.out.println("KDV Tutarı: "+kdvTutar);
        System.out.print("KDV'li tutar: "+kdvliTutar);

    }
}
