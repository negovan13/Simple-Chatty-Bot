import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter string: ");

        String unetiString = scanner.nextLine();
        //System.out.println("Uneti string je: " + unetiString);

        String noviString = unetiString.replace('a', 'b');
        //System.out.println("Novi string je: " + noviString);
        System.out.println(noviString);

    }
}