import java.util.Scanner; //Importa o feature "Scanner" da pasta "util" no java

public class Main {
    public static void main(String[] args) {

        double med_mm, result;

        Scanner in = new Scanner(System.in); //Inicia um novo Scanner que lerá dados

        System.out.println("Digite uma medida em mm: ");
        med_mm = in.nextDouble();
        result = med_mm / 25.4;
        System.out.println("A medida em polegadas = " + result);

    }
}