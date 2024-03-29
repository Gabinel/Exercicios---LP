import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int base, power;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a base: ");
        base = in.nextInt();

        System.out.println("Digite a potência: ");
        power = in.nextInt();

        Calc calculator = new Calc();
        System.out.println(base + " elevado a " + power + " = "
                + calculator.power(base, power));

    }
}