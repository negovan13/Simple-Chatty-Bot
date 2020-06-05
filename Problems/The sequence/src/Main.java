import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unetiBroj = scanner.nextInt();
        int b = unetiBroj;

//        int i = 1;

        for (int i = 1; i <= unetiBroj; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
                b--;
                if (b == 0) {
                    break;
                }

                }
            if (b == 0) {
                break;}
            }
//            i++;
        }


    }
