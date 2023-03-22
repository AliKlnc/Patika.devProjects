import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month;

        Scanner inp = new Scanner(System.in);

        System.out.print("Which month were you born in : ");
        month = inp.nextInt();

        System.out.print("Which day were you born in : ");
        day = inp.nextInt();

        if (month == 1){
            if (day > 0 && day <= 31){
                if (day <= 21){
                    System.out.println("You are a Capricorn.");
                } else {
                    System.out.println("You are an Aquarius.");
                }
            }
        } else if (month == 2) {
            if (day > 0 && day <= 29){
                if (day <= 19){
                    System.out.println("You are an Aquarius.");
                } else {
                    System.out.println("You are a Pisces.");
                }
            }
        } else if (month == 3) {
            if ( day > 0 && day <= 31){
                if (day <= 20){
                    System.out.println("You are a Pisces.");
                } else {
                    System.out.println("You are an Aries.");
                }
            }
        } else if (month == 4) {
            if (day > 0 && day <= 30){
                if( day <= 19){
                    System.out.println("You are an Aries.");
                } else {
                    System.out.println("You are a Taurus.");
                }
            }
        } else if (month == 5) {
            if (day > 0 && day <= 31){
                if( day <= 19){
                    System.out.println("You are a Taurus.");
                } else {
                    System.out.println("You are a Gemini.");
                }
            }
        } else if (month == 6) {
            if (day > 0 && day <= 30){
                if( day <= 20){
                    System.out.println("You are a Gemini.");
                } else {
                    System.out.println("You are a Cancer.");
                }
            }
        } else if (month == 7) {
            if (day > 0 && day <= 31){
                if( day <= 21){
                    System.out.println("You are a Cancer.");
                } else {
                    System.out.println("You are a Leo.");
                }
            }
        } else if (month == 8) {
            if (day > 0 && day <= 31){
                if( day <= 21){
                    System.out.println("You are a Leo.");
                } else {
                    System.out.println("You are a Virgo.");
                }
            }
        } else if (month == 9) {
            if (day > 0 && day <= 30){
                if( day <= 21){
                    System.out.println("You are a Virgo.");
                } else {
                    System.out.println("You are Libra.");
                }
            }
        } else if (month == 10) {
            if (day > 0 && day <= 31){
                if( day <= 21){
                    System.out.println("You are Libra.");
                } else {
                    System.out.println("You are Scorpio.");
                }
            }
        } else if (month == 11) {
            if (day > 0 && day <= 30){
                if( day <= 20){
                    System.out.println("You are Scorpio.");
                } else {
                    System.out.println("You are a Sagittarius.");
                }
            }
        } else if (month == 12) {
            if (day > 0 && day <= 31){
                if( day <= 20){
                    System.out.println("You are a Sagittarius.");
                } else {
                    System.out.println("You are a Capricorn.");
                }
            }
        }
    }
}