package Projects.hafta0;

import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        /* Kaç sayı girmek istediğine göre , girdiği sayıların arasından minumum ve maximum değeri ekrana yazdıran program*/
        int number, max=1;
        int min=1 ;
        Scanner inp=new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int n = inp.nextInt();

        for (int i=1;i<=n;i++){
            System.out.print(i+". sayyıyı giriniz: ");
            number=inp.nextInt();
            if(number>max){
                max=number;
                min=max;
            }

            if (number<min){
                min=number;
            }
        }
        System.out.println("Girilen en küçük sayı: " +min);
        System.out.print("Girilen en Büyük sayı: " +max);

    }
}
