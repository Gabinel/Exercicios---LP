import java.util.Scanner; //Importa o feature "Scanner" da pasta "util" no java

public class Main {
    public static void main(String[] args) {

        double temp_celsius, result;

        Scanner in = new Scanner(System.in); //Inicia um novo Scanner que lerá dados

        System.out.println("Digite uma temperatura em graus Celsius: ");
        temp_celsius = in.nextDouble();
        result = (temp_celsius * 9/5) + 32;

        System.out.println("A temperatura em Ferenheit   é = " + result);

    }
}