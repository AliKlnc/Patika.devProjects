import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        /*
        int k;
        k = inp.nextInt();

        for (int i = 1; i <= k; i *= 2) {
            System.out.println(i);
            }
        */
        System.out.print("Please enter a limit number : ");
        int k = inp.nextInt();

        for (int i = 1; i <= k; i *= 4)
            System.out.print(i + " ");
        System.out.println();
        for (int j = 1; j <= k; j *= 5)
            System.out.print(j + " ");


    }
}