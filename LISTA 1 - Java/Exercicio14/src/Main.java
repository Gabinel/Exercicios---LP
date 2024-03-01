import java.util.Scanner; //Importa o feature "Scanner" da pasta "util" no java

public class Main {
    public static void main(String[] args) {

        double base_t, height_t, result;

        Scanner in = new Scanner(System.in); //Inicia um novo Scanner que lerá dados

        System.out.println("Digite a base e a altura de um triângulo : ");
        base_t = in.nextDouble();
        height_t = in.nextDouble();
        result = base_t * height_t;

        System.out.println("A área do triângulo é = " + result);

    }
}