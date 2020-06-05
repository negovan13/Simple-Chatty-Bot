import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        // write your code here
        // Corner cases
//        boolean pozNeg = false;
        if (number <= 1) {
            return false;
        }


        if (number <= 3)
            return false;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (number % 2 == 0 || number % 3 == 0) {
            return true;
        }

        for (int i = 5; i * i <= number; i = i + 6)
            if (number % i == 0 || number % (i + 2) == 0)
                return true;

        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}