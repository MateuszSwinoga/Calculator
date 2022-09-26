import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner variables = new Scanner(System.in);
        Calculator cal1 = new Calculator();
        int select;

        do {

            System.out.println("Set x");
            float x = variables.nextFloat();
            System.out.println("Set y");
            float y = variables.nextFloat();
            System.out.println("What do you want to do?\nSelected\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Turn off");
            select = variables.nextInt();



            switch (select) {
                case 1:
                    System.out.println("Addition resoult: " + cal1.addition(x, y));
                    break;
                case 2:
                    System.out.println("Substraction resoult: " + cal1.substraction(x, y));
                    break;
                case 3:
                    System.out.println("Multiplication resoult: " + cal1.multiplication(x, y));
                    break;
                case 4:
                    System.out.println("Division Resoult: " + cal1.division(x, y));
                    break;
                case 5:
                    System.out.println("Turned off");
                    break;
            }

        }
        while (select != 5);



    }
}
