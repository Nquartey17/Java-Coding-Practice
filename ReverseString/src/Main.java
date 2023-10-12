
public class Main {

    public static String reverse(String str) {
        String ans = "";
        for (int i = str.length()-1; i >= 0; i--) {
            ans = ans + str.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverse("Hello World"));
    }
}