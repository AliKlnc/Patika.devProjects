import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter value: ");
        int n = inp.nextInt();
        double result = 0;

        for (int i = 0; i <= n; i++){
            result = 1.0 / i;
        }
        System.out.println(result);


    }
}