import java.util.Scanner;

public class WithWhile {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter n1 value:");
        int n1 = inp.nextInt();
        System.out.print("Enter n2 value:");
        int n2 = inp.nextInt();
        int ebob = 1;
        boolean firstFactorPrinted = false;

        int i = 1;
        System.out.print("Common factors: ");
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                if (firstFactorPrinted) {
                    System.out.print(",");
                }
                System.out.print(i);
                firstFactorPrinted = true;
            }
            i++;
        }
        System.out.println();
        System.out.println("-------------");

        int k = n1;
        while (k >= 1) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                System.out.println("Ebob: " + ebob);
                break;
            }
            k--;
        }
        int ekok = (n1 * n2) / ebob;
        System.out.println("Ekok: " + ekok);
    }
}
