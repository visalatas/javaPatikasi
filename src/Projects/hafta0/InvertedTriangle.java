package Projects.hafta0;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        //girilen sayı kadar basamak ile terz yıldız üçgeni yapan program
        Scanner scan=new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz: ");
        int step= scan.nextInt();

        for(int i=step;i>=1;i-=2){
            for (int k = 1; k <= (step - i) / 2; k++) {
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
