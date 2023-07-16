import java.util.Scanner;

public class Main {
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
                    if (select == 1) {
                        System.out.print("You have " + balance + "TL. How much money do you want to deposit:");
                        int price = input.nextInt();
                        balance += price;
                        System.out.println("New balance: " + balance);
                    } else if (select == 2) {
                        System.out.println("You have " + balance + "TL. How much money do you want to withdraw:");
                        int price = input.nextInt();

                        if (balance > price) {
                            balance -= price;
                            System.out.println("New balance " + balance);
                        } else {
                            System.out.println("Insufficient balance");
                        }
                    } else if (select == 3) {
                        System.out.println("Balance: " + balance);
                    } else if (select == 4) {
                        System.out.println("Exiting the program...");

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