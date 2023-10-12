import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static String strCompress(String word) {

        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < word.length(); i += 2) {
            char number = word.charAt(i+1);
            int count = Character.getNumericValue(number);
            while (count > 0) {
                answer.append(word.charAt(i));
                count--;
            }

        }
        return answer.toString();
    }


    public static void main(String[] args) {
        String test = "a3b5c3";

//        System.out.println(test.charAt(3));
        System.out.println("Enter a character followed by a number: ");
        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine();
        System.out.println(strCompress(input));
    }
}