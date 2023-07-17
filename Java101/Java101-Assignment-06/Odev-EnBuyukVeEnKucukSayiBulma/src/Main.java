//ChatGPT'den yardım aldım.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        int max = Integer.MIN_VALUE; // En küçük integer değeriyle başlatılır
        int min = Integer.MAX_VALUE; // En büyük integer değeriyle başlatılır

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Enter number: ");
            int num = input.nextInt();

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        System.out.println("Biggest number: " + max);
        System.out.println("Smallest number: " + min);

        input.close();
    }
}