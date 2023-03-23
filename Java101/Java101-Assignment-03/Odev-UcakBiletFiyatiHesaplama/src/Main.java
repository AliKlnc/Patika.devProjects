import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int km, age;
        double kmPer = 0.10, ticketPrice, discount = 0;

        System.out.print("Enter the distance in km : ");
        km = inp.nextInt();

        System.out.print("Enter your age : ");
        age = inp.nextInt();

        ticketPrice = (km * kmPer);

        System.out.print("Enter trip type (1 => One Way , 2 => Round Trip) : ");
        int choice = inp.nextInt();
        System.out.println("Trip type : " + choice);

        if (choice == 1 || choice == 2) {
            if (choice == 1){
                if (age < 12){
                    discount = (ticketPrice / 2);
                } else if (age >= 12 && age <= 65) {
                    discount = ticketPrice / 10;
                } else if (age > 65){
                    discount = (3 * ticketPrice) / 10;
                }
                ticketPrice = ticketPrice - discount;
                System.out.println("Ticket Price : " + ticketPrice + "TL");
            } else if (choice == 2){
                if (age < 12){
                    discount = (ticketPrice / 2);
                } else if (age >= 12 && age <= 65) {
                    discount = ticketPrice / 10;
                } else if (age > 65){
                    discount = (3 * ticketPrice) / 10;
                }
                ticketPrice = (ticketPrice - (discount * 0.20))*2;
                System.out.println("Ticket Price : " + ticketPrice + "TL");
            }

        } else {
            System.out.println("Invalid value.");
        }


    }
}