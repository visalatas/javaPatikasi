package Projects.hafta0;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        //Mükemmel sayıyı bulan program
        int toplam=1;
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n= scan.nextInt();

        for(int i=2;i<n;i++){
            if(n%i==0){
                toplam+=i;
            }
        }
        if(n==toplam && n!=1){
            System.out.print(n+ " mükemmel sayıdır.");
        }
        else
            System.out.print(n+ " mükemmel sayı değildir.");

    }
}
