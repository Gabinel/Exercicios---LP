import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String text;

        Scanner in = new Scanner(System.in);
        Verificator verif = new Verificator();

        System.out.println("Digite uma frase: ");
        text = in.nextLine();

        verif.inversion(text);

    }
}
