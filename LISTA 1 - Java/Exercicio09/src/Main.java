import java.util.Scanner; //Importa o feature "Scanner" da pasta "util" no java

public class Main {
    public static void main(String[] args) {

        double dis_km, result;

        Scanner in = new Scanner(System.in); //Inicia um novo Scanner que lerá dados

        System.out.println("Digite uma distância em km: ");
        dis_km = in.nextDouble();
        result = dis_km / 1.609;

        System.out.println("A distância em milhas é = " + result);

    }
}