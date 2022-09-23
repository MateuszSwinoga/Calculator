import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value");
        float x = scanner.nextInt();
        System.out.println("Enter second value");
        float y = scanner.nextInt();
        System.out.println("What do you want to do?\nSelected\n1.addition\n2.substraction\n3.multiplication\n4.division");
        int select = scanner.nextInt();


        switch (select) {
            case 1:
                System.out.println("Resoult " + (x+y));
                break;
            case 2:
                System.out.println("Resoult " +(x-y));
                break;
            case 3:
                System.out.println("Resoult " +(x*y));
                break;
            case 4:
                System.out.println("Resoult " +(x/y));
                break;




        }

    }
}