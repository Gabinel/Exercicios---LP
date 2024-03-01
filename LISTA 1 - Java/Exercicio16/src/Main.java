import java.util.Scanner; //Importa o feature "Scanner" da pasta "util" no java
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        double r_cone, h_cone, area_base, result;

        Scanner in = new Scanner(System.in); //Inicia um novo Scanner que lerá dados

        System.out.println("Digite o raio da base e a altura de um cone : ");
        r_cone = in.nextDouble();
        h_cone = in.nextDouble();

        area_base = Math.PI * Math.pow(r_cone,2);
        result = (area_base * h_cone) / 3;

        System.out.println("O volume do cone é = " + result);

    }
}