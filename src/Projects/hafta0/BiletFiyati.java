package Projects.hafta0;

import java.util.Scanner;

public class BiletFiyati {
    public static void main(String[] args) {
        int km, yas, yon;
        double perKm=0.10, toplamTutar=0,indirim=0 , biletFiyati;

        Scanner input =new Scanner(System.in);
        System.out.print("Yolunuz kaç kilometre: ");
        km= input.nextInt();

        System.out.print("Yaşınız kaç: ");
        yas= input.nextInt();

        System.out.print("Gidiş geliş belirtiniz. Tek gidiş=1, Gidiş-geliş=2: ");
        yon= input.nextInt();

        biletFiyati=km*perKm;


        if(km>=1 && yas>=0 && (yon==1 || yon==2)){
            if(yas<12){
                indirim=biletFiyati*0.50;
            } else if (yas>12 && yas<24) {
                indirim=biletFiyati*0.10;
            } else if (yas>65) {
                indirim=biletFiyati*0.30;
            }
            toplamTutar=biletFiyati-indirim;


             if (yon==2) {
                indirim= toplamTutar* 0.20;
                toplamTutar = 2* (toplamTutar- indirim);
            }
            System.out.print("Toplam öenecek tutar: "+toplamTutar);

        }else System.out.print("Hatalı giriş yaptınız");

    }
}
