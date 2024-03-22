import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, sum;

        Scanner in = new Scanner(System.in);

        do {

            System.out.println("Digite um número: ");
            number = in.nextInt();

        } while(number <= 0);

        Calc calculator = new Calc ();
        sum = calculator.Soma(number);

        System.out.println("A soma de 1 à " + number + " é = " + sum);

    }
}