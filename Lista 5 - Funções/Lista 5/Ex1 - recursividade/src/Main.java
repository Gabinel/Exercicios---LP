import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        number = in.nextInt();

        Calc calculator = new Calc();
        System.out.println("A soma de " + number + " até 1 = " + calculator.sum(number));

    }
}