//import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaração de um vetor e suas posições
        int [] vector = new int [10];
        int [] inverse = new int [10];

        Scanner in = new Scanner(System.in);

        System.out.println("Digite dez números inteiros, separados por espaço: ");
        for (int i = 0; i < vector.length; i++){
            vector[i] = in.nextInt();
        }

        System.out.print("A sequência oirginal é: [ ");
        for(int j = 0; j < vector.length; j++){
            inverse[j] = vector[(vector.length - 1) - j];

            System.out.print(vector[j] + " ");
        }

        System.out.println("] ");
        System.out.print("E a sequência invertida é: [ ");

        for (int k = 0; k < vector.length; k++){
            System.out.print(inverse[k] + " ");
        }

        System.out.println("]");

        /* Método por Array
        System.out.println("A ordem original é: " + Arrays.toString(vector));
        System.out.println("E a ordem inversa é: " + Arrays.toString(inverse));
         */

    }
}