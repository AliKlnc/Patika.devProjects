import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter n1 value:");
        int n1 = inp.nextInt();
        System.out.print("Enter n2 value:");
        int n2 = inp.nextInt();
        int ebob = 1;
        boolean firstFactorPrinted = false;


        System.out.print("Common factors: ");
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                if (firstFactorPrinted) {
                    System.out.print(",");
                }
                System.out.print(i);
                firstFactorPrinted = true;
            }
        }
        System.out.println();
        System.out.println("-------------");
        for (int k = n1; k >= 1; k--) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                System.out.println("Ebob: " + ebob);
                break;
            }
        }
        int ekok = (n1 * n2) / ebob;
        System.out.println("Ekok: " + ekok);

    }
}