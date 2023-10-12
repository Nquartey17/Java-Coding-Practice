import java.util.Scanner;

public class Main {

    public static int smallerNumber(int num1, int num2) {
        int highestNum = 1;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                highestNum = i;
            }
        }
        return highestNum;
    }

    public static int hcf (int num1, int num2) {
        int answer = 0;

        if (num1 > num2) {
            answer = smallerNumber(num1, num2);
        }

        else {
            answer = smallerNumber(num2, num1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int value1 = scnr.nextInt();
        System.out.print("Enter the second number: ");
        int value2 = scnr.nextInt();
        System.out.println(hcf(value1, value2) + " is the highest common factor");
    }
}