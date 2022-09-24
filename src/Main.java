import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        System.out.println(cal1.addition(5,8));
        System.out.println(cal1.substraction(5,8));
        System.out.println((cal1.multiplication(5,8)));
        System.out.println(cal1.division(5,8));
    }
}