import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km,  minPrice = 20, startPrice = 10;
        double kmPer = 2.20, lastPrice;

        Scanner inp = new Scanner(System.in);
        System.out.print("Gidilen km : ");
        km = inp.nextInt();

        lastPrice = (km * kmPer) + startPrice;

        lastPrice = (lastPrice < 20) ? 20 : lastPrice;
        System.out.print("Ödeyeceğiniz Tutar : " + lastPrice);



    }
}