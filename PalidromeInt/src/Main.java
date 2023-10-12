
public class Main {

    public static boolean palindromeInt(int num) {
        int reverse = 0;
        int numCopy = num;
        while (numCopy > 0) {
            reverse = (reverse * 10) + (numCopy % 10);
            numCopy = numCopy / 10;
        }
        return reverse == num;
    }

    public static void main(String[] args) {
        System.out.println(palindromeInt(121));
    }
}