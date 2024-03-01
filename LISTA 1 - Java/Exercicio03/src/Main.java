import java.util.Scanner; //Importa o feature "Scanner" da pasta "util" no java

public class Main {
    public static void main(String[] args) {

        double real_n, result;

        Scanner in = new Scanner(System.in); //Inicia um novo Scanner que lerá dados

        System.out.println("Digite um número real: ");
        real_n = in.nextDouble();
        result = real_n / 5;

        System.out.println("A quinta parte do seu número é = " + result);

    }
}