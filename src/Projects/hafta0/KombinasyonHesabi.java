package Projects.hafta0;

import java.util.Scanner;

public class KombinasyonHesabi {
    public static void main(String[] args) {
        int  nFaktöriyel=1, rFkatöriyel=1, minus=1;
        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen kaçın kaçla kombinasyon hesabını yapmak istiyorsanız sıra ile giriniz: ");
        int n= scan.nextInt();
        int r= scan.nextInt();

        for (int i=1; i<=n; i++) {
            nFaktöriyel = nFaktöriyel * i;
        }
        for(int j=1; j<=r; j++) {
            rFkatöriyel = rFkatöriyel * j;
        }
        for(int x=1; x<=n-r; x++){
            minus=minus*x;
        }

        int kombinasyon = nFaktöriyel/(rFkatöriyel*minus);
        System.out.println("Kombinasyon: " + kombinasyon);
    }
}
