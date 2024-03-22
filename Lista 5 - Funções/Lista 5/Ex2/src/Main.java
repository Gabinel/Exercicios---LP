import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, factorial;

        Scanner in = new Scanner(System.in);

        do {

            System.out.println("Digite um número: ");
            number = in.nextInt();

        } while(number <= 0);

        Calc calculator = new Calc();
        factorial = calculator.factorial(number);

        System.out.println("O fatorial de " + number + " é = " + factorial);

    }
}
