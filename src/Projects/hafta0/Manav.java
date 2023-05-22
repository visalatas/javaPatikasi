package Projects.hafta0;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double kg , armut=2.14, elma=3.67, muz=0.95,domates=1.11, patlican=5.00;
        Scanner input=new Scanner(System.in);
        System.out.print("Armutun kg: ");
        double ArmutKg=input.nextDouble();

        System.out.print("Elmanın kg: ");
        double ElmaKg=input.nextDouble();

        System.out.print("Muzun kg: ");
        double muzKg=input.nextDouble();

        System.out.print("Domatesin kg: ");
        double domatesKg=input.nextDouble();

        System.out.print("Patlicanın kg: ");
        double patlicanKg=input.nextDouble();

        double toplam=(armut*ArmutKg)+(elma*ElmaKg)+(muz*muzKg)+(domates*domatesKg)+(patlican*patlicanKg);
        System.out.print("Toplam ödemeniz: "+toplam);

    }
}
