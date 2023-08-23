import java.util.Scanner;

public class Main {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println(result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("ikinci sayı 0'dan farklı olmalı!");
            return 0;
        }
        int result = a / b;
        System.out.println(result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println(result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println(result);
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void calc(int a, int b) {
        System.out.println("Çevresi: " + 2 * (a + b));
        System.out.println("Alanı: " + (a * b));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1-Toplama işlemi\n"
                + "2-Çıkarma işlemi\n"
                + "3-Çarpma işlemi\n"
                + "4-Bölme işlemi\n"
                + "5-Üslü sayı hesaplama\n"
                + "6-Mod alma\n"
                + "7-Dikdörtgen alan ve çevre hesabı\n"
                + "0-Çıkış yap";

        while (true) {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz: ");
            select = scan.nextInt();

            if (select == 0) {
                break;
            }
            System.out.print("a değerini giriniz: ");
            int a = scan.nextInt();
            System.out.print("b değerini giriniz: ");
            int b = scan.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    System.out.println(mod(a, b));
                    break;
                case 7:
                    calc(a, b);
                    break;
                default:
                    System.out.println("Geçersiz işlem.");
            }
        }
    }
}