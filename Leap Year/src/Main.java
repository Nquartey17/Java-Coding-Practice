
public class Main {

    public static boolean leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(leapYear(2021));
    }
}