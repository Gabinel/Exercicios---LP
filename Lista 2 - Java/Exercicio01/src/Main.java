import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        double real_n;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número real: ");
        real_n = in.nextDouble();

        if (real_n >= 0){
            System.out.println("A raíz quadrada de seu número é: " + Math.sqrt(Math.abs(real_n)));
        }

        /*      //Exibe a raíz no conjunto dos complexos
        else{
            real_n = Math.abs(real_n);
            System.out.println("A raíz quadrada de seu número é: " + Math.sqrt(real_n) + "i");
        }
        */

        else{
            System.out.println("Número inválido!");
        }
    }

}