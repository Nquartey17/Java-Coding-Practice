import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int decimalToBinary(int num) {
        ArrayList<Integer> answer = new ArrayList<>();
        int value = 0;

        while (num > 0) {
            answer.add(num % 2);
            num /= 2;
        }


        for (int i = answer.size() - 1; i >= 0; i--) {
            value = (value * 10) +answer.get(i);
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the number to convert to binary: ");
       int value =  scnr.nextInt();
        System.out.println(value + " to binary is " + decimalToBinary(value));
    }
}