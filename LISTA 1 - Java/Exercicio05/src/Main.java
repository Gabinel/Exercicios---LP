import java.util.Scanner; //Importa o feature "Scanner" da pasta "util" no java

public class Main {
    public static void main(String[] args) {

        double vel_kmh, result;

        Scanner in = new Scanner(System.in); //Inicia um novo Scanner que lerá dados

        System.out.println("Digite uma velocidade em km/h: ");
        vel_kmh = in.nextDouble();
        result = vel_kmh / 3.6;

        System.out.println("A velocidade em m/s é = " + result);

    }
}