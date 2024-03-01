import java.util.Scanner; //Importa o feature "Scanner" da pasta "util" no java
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        double r_circle, result;

        Scanner in = new Scanner(System.in); //Inicia um novo Scanner que lerá dados

        System.out.println("Digite o raio de um círculo : ");
        r_circle = in.nextDouble();
        result = Math.PI * Math.pow(r_circle,2);

        System.out.println("A área do circulo é = " + result);

    }
}