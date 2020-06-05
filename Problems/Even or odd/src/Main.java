import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int unetiBroj;

        do   {
            unetiBroj = scanner.nextInt();
            if (unetiBroj==0) {
                break;
            } else if (unetiBroj%2!=0){
                System.out.println("odd");
            } else if (unetiBroj%2==0) {
            System.out.println("even");
            }
        } while (unetiBroj != 0);

    }
}