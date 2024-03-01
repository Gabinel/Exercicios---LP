import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, n2;
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        System.out.println("Menu:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        System.out.println(" ");

        System.out.println("Escolha uma opção: ");
        option = in.nextInt();

        switch (option){
            case 1:
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;

            case 2:
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;

            case 3:
                System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
                break;

            case 4:
                System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                break;

            default:
                System.out.println("Opção de operação matemática inválida!");
        }
    }
}