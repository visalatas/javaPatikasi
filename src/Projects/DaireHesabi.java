package Projects;

import java.util.Scanner;

public class DaireHesabi {
    public static void main(String[] args) {
        double pi=3.14 , r , a ,cevre, alan;

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen dairenin yarıçapını ve merkez açının ölçüsünü giriniz: ");
        r=input.nextDouble();
        System.out.print("Lütfen daire diliminin merkez açının ölçüsünü giriniz: ");
        a=input.nextDouble();

        alan= (pi *(r*r)*a)/360;

        System.out.println("açı ölçüsünü verdiğiniz dilimin alanı: "+ alan);

    }
}
