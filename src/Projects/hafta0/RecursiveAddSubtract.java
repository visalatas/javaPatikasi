package Projects.hafta0;

import java.util.Scanner;

public class RecursiveAddSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();

        recursiveAddSubtract(n);

        scanner.close();
    }

    public static void recursiveAddSubtract(int num) {
        System.out.print(num + " ");

        if (num <= 0) {
            System.out.println();
            return;
        }

        recursiveAddSubtract(num - 5);
        System.out.print(num + " ");
    }
}
