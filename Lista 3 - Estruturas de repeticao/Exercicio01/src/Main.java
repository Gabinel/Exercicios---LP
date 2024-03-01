import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n1 = in.nextDouble();

        //Para "i" que tem valor inicial 0, enquanto este for menor ou igual a 10, ao final incrementar "+1" a "i"
        for (int i = 0; i <= 10; i++){
            System.out.println(n1 + " * " + i + " = " + n1 * i);
        }

    }
}