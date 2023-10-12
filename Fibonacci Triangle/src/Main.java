
public class Main {

    public static void fibonacciTriangle (int n) {

        for (int i = 1; i <= n; i++) {
            int a=0;
            int b=1;
            System.out.print(b);
            for (int j = 1; j < i; j++) {
                int c = a+b;
                System.out.print(c);
                a = b;
                b=c;
            }
            System.out.println();
        }
    }

    public static int fib (int n) {
        //base case
        if (n <= 1) {
            return 1;
        }

        return fib(n -1) +fib(n - 2);
    }

    public static void main(String[] args) {
        fibonacciTriangle(5);
    }
}