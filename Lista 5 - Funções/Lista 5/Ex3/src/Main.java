import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x, y;
        double power;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a base: ");
        x = in.nextInt();

        System.out.println("Digite a potência: ");
        y = in.nextInt();

        Calc calculator = new Calc();
        power = calculator.power(x, y);

        System.out.println(x + " elevado a potência de " + y + " é = " + power);

    }
}
