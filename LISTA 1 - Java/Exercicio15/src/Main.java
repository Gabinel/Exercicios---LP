import java.util.Scanner; //Importa o feature "Scanner" da pasta "util" no java
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        double r_cilinder, h_cilinder, area_base, result;

        Scanner in = new Scanner(System.in); //Inicia um novo Scanner que lerá dados

        System.out.println("Digite o raio da base e a altura de um cilindro : ");
        r_cilinder = in.nextDouble();
        h_cilinder = in.nextDouble();

        area_base = Math.PI * Math.pow(r_cilinder,2);
        result = area_base * h_cilinder;

        System.out.println("O volume do cilindro é = " + result);

    }
}