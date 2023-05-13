package Projects;

import java.util.Scanner;

public class DikUcgendeHipotenusHesabi {
    public static void main(String[] args) {
        int aKenari, bKenari;
        double hipotenus;
        double cevre;
        double alan;
        double u;

        Scanner input=new Scanner(System.in);
        System.out.println("a kenarını giriniz: ");
        aKenari= input.nextInt();
        System.out.println("b kenarını giriniz: ");
        bKenari=input.nextInt();
        hipotenus= Math.sqrt((aKenari*aKenari) + (bKenari*bKenari));
        System.out.println("hipotenüs: "+hipotenus);

        u=(aKenari+bKenari+hipotenus)/2;
        cevre= 2*u;
        alan=Math.sqrt(u*(u-aKenari)*(u-bKenari)*(u-hipotenus));
        
        System.out.println("cevre: "+cevre);
        System.out.println("alan: "+alan);





    }
}
