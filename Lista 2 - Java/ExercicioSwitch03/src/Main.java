import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        double n1, n2;
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Círculo");
        System.out.println("2. Triângulo retângulo");
        System.out.println("3. Retângulo");

        System.out.println(" ");

        System.out.println("Escolha uma opção: ");
        option = in.nextInt();

        switch (option){
            case 1:
                System.out.println("Informe o raio: ");
                n1 = in.nextInt();

                System.out.println("Área = " + (Math.PI * Math.pow(n1, 2)));
                System.out.println("Perímetro = " + (2 * Math.PI * n1));

                break;

            case 2:
                System.out.println("Informe a base: ");
                n1 = in.nextInt();

                System.out.println("Informe a altura: ");
                n2 = in.nextInt();

                System.out.println("Área = " + ((n1 * n2) / 2));

                //System.out.println("Perímetro = " + (n1 + n2 + (Math.hypot(n1, n2))));

                double hypot;
                hypot = Math.sqrt(Math.pow(n1, 2) + Math.pow(n2, 2));

                System.out.println("Perímetro = " + (n1 + n2 + (hypot)));

                break;

            case 3:
                System.out.println("Informe a base: ");
                n1 = in.nextInt();

                System.out.println("Informe a altura: ");
                n2 = in.nextInt();

                System.out.println("Área = " + (n1 * n2));
                System.out.println("Perímetro = " + ((2 * n1) + (2 * n2)));

                break;

            default:
                System.out.println("Opção de operação geométrica inválida!");
        }
    }
}