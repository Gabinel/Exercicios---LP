import java.util.Scanner; //Importa o feature "Scanner" da pasta "util" no java

public class Main {
    public static void main(String[] args) {

        double vel_ms, result;

        Scanner in = new Scanner(System.in); //Inicia um novo Scanner que lerá dados

        System.out.println("Digite uma velocidade em m/s: ");
        vel_ms = in.nextDouble();
        result = vel_ms * 3.6;

        System.out.println("A velocidade em km/h é = " + result);

    }
}