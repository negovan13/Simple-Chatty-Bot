import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int unetiBroj = scanner.nextInt();
        int brojac = 1;

        while (brojac*brojac <= unetiBroj) {
            System.out.println(brojac*brojac);
            brojac++;
        }
        
    }
}