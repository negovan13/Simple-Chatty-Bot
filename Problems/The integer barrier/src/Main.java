import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        int sum = 0;

        do {
            inputNumber = scanner.nextInt();
            sum += inputNumber;
            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
        } while (inputNumber !=0);
        System.out.println(sum);
    }
}