import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1 = 0, n2 = 1, result, n;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n = in.nextInt();

        if (n >= 1){
            System.out.print(n1);
        }

        if (n >= 2){
            System.out.print(", ");
            System.out.print((n1 + n2));
        }

        for (int i = 0; i < (n-2); i++){
            result = n1 + n2;
            System.out.print(", " + result);
            n1 = n2;
            n2 = result;
        }

    }
}