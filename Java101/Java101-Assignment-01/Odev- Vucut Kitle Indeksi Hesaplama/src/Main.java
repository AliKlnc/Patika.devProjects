import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kg;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = inp.nextDouble();

        double kitleIndeks = kg / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz : " + kitleIndeks);
    }
}