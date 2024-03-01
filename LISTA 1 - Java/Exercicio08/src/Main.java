import java.util.Scanner; //Importa o feature "Scanner" da pasta "util" no java

public class Main {
    public static void main(String[] args) {

        double med_pol, result;

        Scanner in = new Scanner(System.in); //Inicia um novo Scanner que lerá dados

        System.out.println("Digite uma medida em polegadas: ");
        med_pol = in.nextDouble();
        result = med_pol * 25.4;

        System.out.println("A medida em mm é = " + result);

    }
}