import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float n1,n2;
        int process;
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter the first variable: ");
        n1=inp.nextFloat();

        System.out.print("Enter the second variable: ");
        n2=inp.nextFloat();

        System.out.println("Choose your process\n1)Sum:\n2)Extraction:\n3)Multiplication:\n4)Division:\n");
        System.out.print("Your choice : ");
        process = inp.nextInt();

        switch (process){
            case 1:
                System.out.println("Sum : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Extraction : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Multiplicaiton : " + (n1 * n2));
                break;
            case 4:{
                if (n2 != 0){
                    System.out.println("Divison : " + (n1 / n2));
                } else {
                    System.out.println("Invalid case.");
                }
            }   break;
            default:
                System.out.println("Invalid case.");



        }
    }
}