import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz = ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = inp.nextInt();

        double ortalama = (mat + fizik + kimya + tarih + turkce + muzik) / 6.0;
        System.out.println("Ortalamanız : " + ortalama);

        String str = (ortalama >= 60) ? "Sınıfı geçtiniz." : "Sınıfta kaldınız.";
        System.out.print(str);
    }
}