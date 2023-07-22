package Projects.hafta0;

import java.util.Scanner;

public class RecursivePrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " sayısı ASALDIR !");
        } else {
            System.out.println(number + " sayısı ASAL değildir !");
        }

        scanner.close();
    }

    public static boolean isPrime(int num, int divisor) {
        if (num <= 2) {
            return num == 2;
        }

        if (divisor == 1) {
            return true;
        }

        if (num % divisor == 0) {
            return false;
        }

        return isPrime(num, divisor - 1);
    }

    public static boolean isPrime(int num) {
        return isPrime(num, num - 1);
    }
}
