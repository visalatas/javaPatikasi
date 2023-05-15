package Projects;

import java.util.Scanner;

public class TaksimetrePrice {
    public static void main(String[] args) {
        int km;
        double perKm=2.20, total=10;

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen km giriniz: ");
        km= input.nextInt();
        total+= km * perKm;
        total= (total<20) ? 20 : total;
        System.out.print("Total: "+ total);

    }
}
