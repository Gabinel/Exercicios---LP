import java.util.Scanner; //Importa o feature "Scanner" da pasta "util" no java

public class Main {
    public static void main(String[] args) {

        double dis_ml, result;

        Scanner in = new Scanner(System.in); //Inicia um novo Scanner que lerá dados

        System.out.println("Digite uma distância em milhas: ");
        dis_ml = in.nextDouble();
        result = dis_ml * 1.609;

        System.out.println("A distância em km é = " + result);

    }
}