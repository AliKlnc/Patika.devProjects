import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int a = inp.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int b = inp.nextInt();

        int result = power(a, b);
        System.out.println(a + " ^ " + b + " = " + result);
    }

    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * power(a, b - 1);
        }
    }
}