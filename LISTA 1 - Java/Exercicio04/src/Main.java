import java.util.Scanner; //Importa o feature "Scanner" da pasta "util" no java

public class Main {
    public static void main(String[] args) {

        double n1, n2, result;;

        Scanner in = new Scanner(System.in); //Inicia um novo Scanner que lerá dados

        System.out.println("Digite duas notas: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();
        result = (n1 + n2) / 2;
        System.out.println("A média das notas é = " + result);

    }
}