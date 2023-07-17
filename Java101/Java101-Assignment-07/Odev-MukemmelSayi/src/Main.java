//Mükemmel sayı: Kendisi dışında çarpanları toplamı kendisine eşit olan sayıya Mükemmel sayı denir.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int total = 0;

        System.out.print(n + " Sayısının çarpanları: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                total += i;
                System.out.print(i + ",");
            }
        }
        System.out.println();
        total -= n;
        if (total == n){
            System.out.println(n + " Mükemmel sayıdır.");
        } else{
            System.out.println(n + " Mükemmel sayı değildir.");
        }
    }
}