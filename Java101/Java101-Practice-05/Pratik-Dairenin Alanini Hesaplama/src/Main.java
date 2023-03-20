/*Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

        Alan Formülü : π * r * r;

        Çevre Formülü : 2 * π * r;

        Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double r, pi = 3.14, Alan, Cevre;

        Scanner inp = new Scanner (System.in);
        System.out.print("Dairenin yarıçapı : ");
        r = inp.nextDouble();

        Alan = (pi * r * r);
        Cevre = (2 * pi * r);

        System.out.println("Dairenin Alanı : " + Alan);
        System.out.println("Dairenin Çevresi : " + Cevre);

        //Merkez açı ölçüsü için 'a' değişkeni tanımlıyorum.
        int a;
        double formul;

        System.out.print("Daire diliminin açısı : ");
        a = inp.nextInt();

        formul = (pi * (r*r) * a) / 360;
        System.out.print("Daire diliminin alanı : " + formul);




    }
}