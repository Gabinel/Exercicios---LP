import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, fact;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n1 = in.nextInt();
        fact = n1;

        System.out.print("O fatorial de " + n1 + " é: ");

        for (int i = 1; i < n1; i++){
            fact = fact * (n1-i);

            System.out.print(i + " * ");
        }

        System.out.println(n1 + " = " + fact);

    }
}