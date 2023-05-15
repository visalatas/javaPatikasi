package Projects;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Double boy, kilo, oran;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu giriniz: ");
        boy=input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo=input.nextDouble();
        oran=kilo/(boy*boy);

        System.out.println("Vücut kitle indeksiniz: "+oran);

    }
}
