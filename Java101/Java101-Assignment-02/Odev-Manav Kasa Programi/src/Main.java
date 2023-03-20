import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Armut, Elma, Domates, Muz, Patlıcan;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut kaç kilo : ");
        Armut = inp.nextDouble();

        System.out.print("Elma kaç kilo : ");
        Elma = inp.nextDouble();

        System.out.print("Domates kaç kilo : ");
        Domates = inp.nextDouble();

        System.out.print("Muz kaç kilo : ");
        Muz = inp.nextDouble();

        System.out.print("Patlıcan kaç kilo : ");
        Patlıcan = inp.nextDouble();

        double toplam = (Armut * 2.14) + (Elma * 3.67) + (Domates * 1.11) + (Muz * 0.95) + (Patlıcan * 5.00);
        System.out.print("Toplam Tutar : " + toplam + " TL");

    }
}