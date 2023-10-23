import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int basamaklarToplami(int sayi){
        if (sayi == 0){
            return 0;
        }else
            return sayi % 10 + basamaklarToplami(sayi / 10);
    }
    public static void main(String[] args){
        System.out.println("Basamak toplami: "+basamaklarToplami(45612));
    }

}


