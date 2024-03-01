import java.util.Scanner; //Importa o feature "Scanner" da pasta "util" no java

public class Main {
    public static void main(String[] args) {

        int n1;
        double result;

        Scanner in = new Scanner(System.in); //Inicia um novo Scanner que lerá dados

        System.out.println("Digite um número inteiro: ");
        n1 = in.nextInt();
        result = n1 * 2;

        System.out.println("O dobro do seu número é = " + result);

    }
}