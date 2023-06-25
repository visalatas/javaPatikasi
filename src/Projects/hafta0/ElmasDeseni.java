package Projects.hafta0;

import java.util.Scanner;

public class ElmasDeseni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısını girin: ");
        int satirSayisi = scanner.nextInt();

        int boslukSayisi = satirSayisi - 1;
        int yildizSayisi = 1;

        // Üst kısım
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }

            System.out.println();

            boslukSayisi--;
            yildizSayisi += 2;
        }

        boslukSayisi = 1;
        yildizSayisi = 2 * (satirSayisi - 1) - 1;

        // Alt kısım
        for (int i = 0; i < satirSayisi - 1; i++) {
            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }

            System.out.println();

            boslukSayisi++;
            yildizSayisi -= 2;
        }
    }
}
