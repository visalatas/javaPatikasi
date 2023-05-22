package Projects;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double a, b;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz: ");
        a= input.nextDouble();
        System.out.print("Lütfen sayı giriniz: ");
        b= input.nextDouble();

        System.out.println("1:Toplama\n2:Çıkarma\n3:Çarpma\n4:Bölme");
        System.out.print("Yukardaki işlemlerden birini seçiniz: ");
        int select= input.nextInt();

        switch (select){
            case 1:
                System.out.print("Toplamı: "+(a+b));
                break;
            case 2:
                System.out.print("Farkı: "+(a-b));
                break;
            case 3:
                System.out.print("Çarpımı: "+(a*b));
                break;
            case 4:
                if (b!=0)
                    System.out.print("Bölümü: "+(a/b));
                else
                    System.out.print("Bir sayı 0'a bölünemez." );

                break;
            default:
                System.out.print("hatalı seçim yaptınız. Tekrar deneyiniz.");
        }
    }


}
