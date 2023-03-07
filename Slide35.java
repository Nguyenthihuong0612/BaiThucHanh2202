import java.util.Scanner;

public class Slide35 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();

        System.out.printf("Output: %d", a < b ? a : b);
    }
}