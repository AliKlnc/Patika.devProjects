import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 4500;
        int select;

        while (right > 0) {
            System.out.print("Enter your username: ");
            userName = input.nextLine();
            System.out.print("Enter your password: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome to the Bank. You have " + balance + "TL");

                do {
                    System.out.println("Please select the action you want to do: ");
                    System.out.println("1- Deposit money\n" +
                            "2- Withdraw money\n" +
                            "3- Balance inquiry\n" +
                            "4- Exit");
                    System.out.print("Select: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("You have " + balance + "TL. How much money do you want to deposit: ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("New balance: " + balance);
                            break;
                        case 2:
                            System.out.print("You have " + balance + "TL. How much money do you want to withdraw: ");
                            price = input.nextInt();

                            if (balance >= price) {
                                balance -= price;
                                System.out.println("New balance: " + balance);
                            } else {
                                System.out.println("Insufficient balance");
                            }
                            break;
                        case 3:
                            System.out.println("Balance: " + balance);
                            break;
                        case 4:
                            System.out.println("Exiting the program...");
                            break;
                        default:
                            System.out.println("Invalid selection. Please try again.");
                            break;
                    }
                } while (select != 4);

                break;
            } else {
                right--;
                System.out.println("Wrong username or password. Try again.");

                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank.");
                } else {
                    System.out.println("Your Remaining Rights: " + right);
                }
            }
        }
    }
}