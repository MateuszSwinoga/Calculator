import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner variables = new Scanner(System.in);
        System.out.println("Set x");
        float x = variables.nextFloat();
        System.out.println("Set y");
        float y = variables.nextFloat();



        Calculator cal1 = new Calculator();
        System.out.println("Addition resoult: " + cal1.addition(x,y));
        System.out.println("Substraction resoult: " + cal1.substraction( x,y));
        System.out.println("Multiplication resoult: " + cal1.multiplication( + x,y));
        System.out.println("Division Resoult: " + cal1.division(+ x,y));
    }
}