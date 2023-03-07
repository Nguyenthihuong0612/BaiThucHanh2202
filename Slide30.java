import java.util.Scanner;
public class Slide30  {
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Input: ");
    
            int n = scanner.nextInt();
    
            int sum = 0;
    
            while(n > 0) {
                sum +=  n%10;
                n /= 10;
            }
    
            System.out.printf("Output: %d ", sum);
        }
    }

