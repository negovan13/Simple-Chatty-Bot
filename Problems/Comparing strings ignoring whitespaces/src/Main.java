import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String prvi = scanner.nextLine();
        String drugi = scanner.nextLine();
        boolean tacnoNetacno = true;

        String prviBezRazmaka = prvi.replaceAll("\\s+","");
        String drugiBezRazmaka = drugi.replaceAll("\\s+","");

        if (prviBezRazmaka.equalsIgnoreCase(drugiBezRazmaka)) {
            System.out.println(tacnoNetacno);
            } else {
            System.out.println(!tacnoNetacno);
        }
    }
}