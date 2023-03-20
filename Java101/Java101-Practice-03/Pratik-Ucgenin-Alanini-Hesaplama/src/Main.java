/*Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c;
        double u, Alan;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. Kenarın uzunluğu : ");
        a = inp.nextInt();
        System.out.print("2. Kenarın uzunluğu : ");
        b = inp.nextInt();
        System.out.print("3. Kenarın uzunluğu : ");
        c = inp.nextInt();

        u = (a + b + c) / 2;
        System.out.println("Üçgenin çevresi : " + 2*u);

        Alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.print("Üçgenin alanı : " + Alan);

    }
}