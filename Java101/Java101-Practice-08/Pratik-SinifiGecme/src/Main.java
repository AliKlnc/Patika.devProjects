import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, turkish, chem, music;

        Scanner inp = new Scanner(System.in);

        System.out.print("Your math grade : ");
        math = inp.nextInt();

        System.out.print("Your physics grade : ");
        physics = inp.nextInt();

        System.out.print("Your turkish grade : ");
        turkish = inp.nextInt();

        System.out.print("Your chem grade : ");
        chem = inp.nextInt();

        System.out.print("Your music grade : ");
        music = inp.nextInt();

        if(math > 100 || math < 0){
            math = 0;
        } else if (physics > 100 || physics < 0){
            physics = 0;
        } else if (turkish > 100 || turkish < 0){
            turkish = 0;
        } else if (chem > 100 || chem < 0){
            chem = 0;
        } else if (music > 100 || music < 0){
            music = 0;
        }

        double average = (math + physics + turkish + chem + music) / 5;

        if(average >= 55){
            System.out.println("You passed the class.");
        } else {
            System.out.println("You failed the class, see you next year.");
        }

        System.out.println("Your average grade is : " + average);

    }
}