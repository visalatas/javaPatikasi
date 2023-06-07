package Projects.hafta0;

import java.util.Scanner;

public class DoubleAndMultiplesFour {
    public static void main(String[] args) {
        int i;
        int total=0;
        Scanner inp= new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz: ");
            i= inp.nextInt();
            if(i%2==0 && i%4==0){
                total+= i;
            }

        }while (i % 2==0);

        System.out.print("Toplam: "+total);
    }
}
