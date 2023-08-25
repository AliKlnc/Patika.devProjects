import java.util.Scanner;

public class Main {
    public static void desen() {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the n value: ");
        int n = inp.nextInt();

        int firstValue = n;

        while (firstValue > 0) {
            System.out.println(firstValue);
            firstValue -= 5;

            if (firstValue == 0 || firstValue <= 0) {
                firstValue -= 5;
            }
        }


        int lastValue = firstValue;

        while (lastValue < n) {
            lastValue += 5;
            System.out.println(lastValue);
        }
    }


    public static void main(String[] args) {

        desen();

    }

}



