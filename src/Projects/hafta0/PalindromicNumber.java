package Projects.hafta0;

import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        if (isPalindromicNumber(number)) {
            System.out.println(number + " bir palindromik sayıdır.");
        } else {
            System.out.println(number + " bir palindromik sayı değildir.");
        }

        scanner.close();
    }

    public static boolean isPalindromicNumber(int number) {
        int originalNumber = number;
        int reverse = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        return originalNumber == reverse;
    }
}
