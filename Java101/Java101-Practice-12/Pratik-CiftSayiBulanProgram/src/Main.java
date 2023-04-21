/*Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen
sayıların ortalamasını hesaplayan programı yazınız.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int k, total = 0, number = 0;

        System.out.print("Enter number : ");
        k = inp.nextInt();

        for(int i = 0; i <= k; i++){
            if((i % 3 == 0) && (i % 4 == 0)){
                total += i;
                number++;
            }
        }
        double average = total / number;
        System.out.println("Total of numbers : " + total);
        System.out.println("Number of numbers : " + number);
        System.out.println("Average : " + average);

    }
}