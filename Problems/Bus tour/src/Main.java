import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int visinaBusa = scanner.nextInt();
        int brojMostova = scanner.nextInt();

        for (int i = 0; i < brojMostova; i++) {
            if (scanner.nextInt() <= visinaBusa) {
                System.out.printf("Will crash on bridge %d%n", i + 1);
                break;
            }
            if (i == brojMostova - 1) {
                System.out.println("Will not crash");
            }
        }
    }
}