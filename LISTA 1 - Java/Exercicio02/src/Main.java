import java.util.Scanner; //Importa o feature "Scanner" da pasta "util" no java
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        int n1;
        double result;

        Scanner in = new Scanner(System.in); //Inicia um novo Scanner que lerá dados

        System.out.println("Digite um número inteiro: ");
        n1 = in.nextInt();
        result = Math.pow(n1,2);

        System.out.println("O quadrado do seu número é = " + result);

    }
}