package Projects.hafta0;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();
        scanner.close();

        int ilkEleman = 0;
        int ikinciEleman = 1;

        System.out.print(elemanSayisi + " Elemanlı Fibonacci Serisi: " + ilkEleman + " " + ikinciEleman);

        for (int i = 2; i < elemanSayisi; i++) {
            int yeniEleman = ilkEleman + ikinciEleman;
            System.out.print(" " + yeniEleman);

            ilkEleman = ikinciEleman;
            ikinciEleman = yeniEleman;
        }
    }
}
