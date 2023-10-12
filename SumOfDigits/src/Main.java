
public class Main {

    public static int digitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + (num % 10);
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(digitSum(567));
    }
}