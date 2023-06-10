package Projects.hafta0;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int n, r, total=1;
        Scanner inp= new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        n= inp.nextInt();
        System.out.print("Üs olacak sayı: ");
        r= inp.nextInt();

        for (int i=1; i<=r; i++){
            total*=n;
        }
        System.out.print(total);

    }
}
