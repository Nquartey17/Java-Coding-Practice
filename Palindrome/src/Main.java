import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static boolean palindrome(String str) {

//        String reverse = "";
//        str = str.toLowerCase().replaceAll(" ", "");
//        for (int i = 0; i < str.length(); i++) {
//            reverse = reverse + str.charAt(i);
//        }
//        if (str.equals(reverse)) {
//            return true;
//        }

        StringBuilder reverse = new StringBuilder();
        str= str.toLowerCase();
        String compare = str.replaceAll(" ", "");
        reverse.append(compare);
        if (compare.equals(reverse.reverse().toString())) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "Civic1s";
        System.out.println(palindrome(str));
    }
}