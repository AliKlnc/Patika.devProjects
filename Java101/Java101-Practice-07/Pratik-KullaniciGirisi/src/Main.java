import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int select;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your username : ");
        userName = inp.nextLine();

        System.out.print("Enter your password : ");
        password = inp.nextLine();

        if (userName.equals("patika") && (password.equals("java123"))){
            System.out.println("Successfully loged in");
        } else {
            System.out.println("Wrong username or password.");
            System.out.println("Would you like to reset your password?\n1-Yes\n2-No");
            select = inp.nextInt();
            System.out.println("Your choice : " + select);

            if(select == 1){
                System.out.println("Warning : The password you want to set must not be the same as the previous one.");

                System.out.print("New password : ");
                String newPass = inp.next();
                
                if (newPass.equals("java123")){
                    System.out.println("The password you entered is the same as the previous password, please try another password.");
                } else {
                    System.out.println("Your password has been changed.");
                }

            } else {
                System.out.println("Failed login.");
            }
        }
    }

}
