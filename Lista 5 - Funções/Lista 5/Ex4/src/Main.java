import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String text, inversed;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        text = in.next();

        Verificator inversion = new Verificator();
        inversed = inversion.inversion(text);

        System.out.println(inversed);

    }
}
