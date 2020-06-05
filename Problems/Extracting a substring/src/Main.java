import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String rec = scanner.nextLine();
        int duzinaReci = rec.length();
        int odPozicije = scanner.nextInt();
        int doPozicije = scanner.nextInt() + 1;

        if (duzinaReci > 0 && odPozicije >= 0 && odPozicije < duzinaReci && doPozicije >= 0 && doPozicije <= duzinaReci && doPozicije > odPozicije) {
            System.out.println(rec.substring(odPozicije,doPozicije));
        }
    }
}