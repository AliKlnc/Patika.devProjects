/*Ödev
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k, total = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter n value : ");
        n = inp.nextInt();
        System.out.print("Enter k value : ");
        k = inp.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.print(total);
    }
}