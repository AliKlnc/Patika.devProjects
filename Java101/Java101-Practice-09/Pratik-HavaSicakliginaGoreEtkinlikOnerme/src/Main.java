import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Conditions :
        Suggest to "Ski" if the temperature is less than 5.
        Suggest the "Cinema" event if the temperature is between 5 and 15.
        Suggest the "Picnic" event if the temperature is between 15 and 25.
        Suggest the "Swimming" event if the temperature is greater than 25.
         */

        int temperature;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter temperature : ");
        temperature = inp.nextInt();

        if(temperature <= 5){
            System.out.println("We recommend skiing.");
        } else if (15 >= temperature && temperature > 5) {
            if(temperature < 10){
                System.out.println("We recommend Cinema.");
            } else {
                System.out.println("We recommend Cinema or Picnic.");
            }
        } else if (25 >= temperature && temperature >= 10) {
            System.out.println("We recommend Picnic.");
        } else if (25 <= temperature) {
            System.out.println("We recommend Swimming.");
        } else {
            System.out.println("Invalid value");
        }
    }
}