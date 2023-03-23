import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int year, value;

        System.out.print("Enter your year of birth : ");
        year = inp.nextInt();

        value = year % 12;

        String zodiacSign = "";
        switch (value) {
            case 0:
                zodiacSign = ("Monkey");
                break;
            case 1:
                zodiacSign = ("Cockerel");
                break;
            case 2:
                zodiacSign = ("Dog");
                break;
            case 3:
                zodiacSign = ("Pig");
                break;
            case 4:
                zodiacSign = ("Mouse");
                break;
            case 5:
                zodiacSign = ("Ox");
                break;
            case 6:
                zodiacSign = ("Tiger");
                break;
            case 7:
                zodiacSign = ("Rabbit");
                break;
            case 8:
                zodiacSign = ("Dragon");
                break;
            case 9:
                zodiacSign = ("Snake");
            case 10:
                zodiacSign = ("Horse");
                break;
            case 11:
                zodiacSign = ("Sheep");
                break;
            default:
                System.out.println("Invalid value");
        } System.out.println("Your Chinese Zodiac Sign : " + zodiacSign);
    }
}