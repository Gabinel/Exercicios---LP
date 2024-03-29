import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        number = in.nextInt();

        Calc calculator = new Calc();
        System.out.println("O fatorial de " + number + " = " + calculator.factorial(number));

    }
}