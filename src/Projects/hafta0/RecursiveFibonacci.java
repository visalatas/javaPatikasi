package Projects.hafta0;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        int n = 5; // İstenilen Fibonacci serisi eleman sayısı
        System.out.println("Fibonacci serisi: ");
        for (int i = 1; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n == 1||n==2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
