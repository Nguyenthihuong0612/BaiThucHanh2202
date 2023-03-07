import java.util.Scanner;

public class Slide34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.printf("Delta: %.2f\n", delta);

        if (delta < 0) {
            System.out.print("Phuong trinhg vo nghiem");
        } else if (delta > 0) {
            System.out.printf("Phuong trinh co 2 nghiem x1 = %.2f va x2 = %.2f", (float) ((-b + Math.sqrt(delta)) / (2*a)), (float) ((-b - Math.sqrt(delta)) / (2*a)));
        } else {
            System.out.printf("Phuong trinh co 1 nghiem kep x1 = x2 = %.2f", -b / (2 * a));
        }
    }
}