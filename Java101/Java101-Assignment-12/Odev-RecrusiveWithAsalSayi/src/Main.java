import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();

        if (isAsal(sayi)) {
            System.out.println(sayi + " sayısı ASALDIR !");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir !");
        }
    }

    // Recursive olarak asal sayı kontrolü
    static boolean isAsal(int sayi) {
        return asalMi(sayi, sayi / 2);
    }

    static boolean asalMi(int sayi, int bolen) {
        if (bolen == 1) {
            return true;
        } else {
            if (sayi % bolen == 0) {
                return false;
            } else {
                return asalMi(sayi, bolen - 1);
            }
        }
    }
}
