import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static boolean armstrongNumber (int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        int numCopy = num;
        while (num > 0) {
            //get the last digit
            arr.add(num % 10);
            //make number smaller
            num /= 10;
        }
        int compare = 0;
        for (int i = 0; i < arr.size(); i++) {
            compare += (int) Math.pow(arr.get(i), arr.size());
        }

        if (compare == numCopy) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scnr.nextInt();

        if (armstrongNumber(number)) {
            System.out.println(number + " is an Armstrong Number");
        }

        else {
            System.out.println(number + " is not an Armstrong Number");
        }
    }
}