import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String text, withoutSpaces;
        boolean palindrome;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma frase / palavra: ");
        text = in.nextLine();

        Verificator verif = new Verificator();
        withoutSpaces = verif.removeSpaces(text, 0);

        palindrome = verif.verify(withoutSpaces, 0, withoutSpaces.length() - 1);

        if (palindrome)
            System.out.println(text + " é um palíndromo!");
        else
            System.out.println(text + " não é um palíndromo!");

    }
}