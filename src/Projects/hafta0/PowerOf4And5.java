package Projects.hafta0;

import java.util.Scanner;

public class PowerOf4And5 {
    public static void main(String[] args) {
        int n;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n= inp.nextInt();
         for (int i =1; i<=n; i*=4){
             System.out.println(i);
         }
         for (int i =1; i<=n; i*=5){
             System.out.println(i);

         }

    }
}
