import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, kdvOran, kdvTutari, kdvliTutar;

        Scanner inp = new Scanner(System.in);

        System.out.print("Ücret tutarını giriniz : ");
        tutar = inp.nextDouble();

        kdvOran = (tutar > 0) && (tutar < 1000) ? 0.18 : 0.8;

        kdvTutari = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutari;

        System.out.println("KDV'siz tutarı : " + tutar);
        System.out.println("KDV oranı : " + kdvOran);
        System.out.println("KDV tutarı : " + kdvTutari);
        System.out.print("KDV'li tutar : " + kdvliTutar);




    }
}