import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int n = inp.nextInt(); // n => number of lines

        for (int i = 0; i <= n; i++) {
            for (int k = 0; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}