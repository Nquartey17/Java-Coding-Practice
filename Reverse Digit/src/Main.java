import java.util.ArrayList;

public class Main {

    public static int reverseInt(int num) {

        int answer = 0;
        while (num > 0) {
            answer = (answer * 10) + (num % 10);
            num /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(reverseInt(12345));
    }
}