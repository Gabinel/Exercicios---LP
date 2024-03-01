import java.util.Scanner; //Importa o feature "Scanner" da pasta "util" no java

public class Main {
    public static void main(String[] args) {

        double a, b, result;

        Scanner in = new Scanner(System.in); //Inicia um novo Scanner que lerá dados

        System.out.println("Digite os coeficientes a e b de uma equação do primeiro grau : ");
        a = in.nextDouble();
        b = in.nextDouble();

        result = (-1 * b) / a;

        System.out.println("A equação é = " + a + "X + " + b + " = 0, e sua solução é = " + result);

    }
}