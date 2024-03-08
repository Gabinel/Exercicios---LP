import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaração de um vetor e suas posições
        int [] vector = new int [10];
        int aux;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite 10 números, separados por espaço:");
        for (int i = 0; i < vector.length; i++){
            vector[i] = in.nextInt();
        }

        for (int j = 0; j < vector.length / 2; j++){
            aux = vector[j];

            vector[j] = vector[(vector.length - 1) - j];
            vector[(vector.length - 1) - j] = aux;
        }

        System.out.print("A sequência invertida é: [ ");

        for (int k = 0; k < vector.length; k++){
            System.out.print(vector[k] + " ");
        }

        System.out.println("]");

    }
}