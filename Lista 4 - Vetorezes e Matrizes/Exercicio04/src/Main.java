import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaração de um vetor e suas posições
        int [] vector = new int[10];
        int big = 0, sml = 0;

        Scanner in = new Scanner(System.in);

        for(int i = 0; i < vector.length; i++){
            System.out.println("Digite um número inteiro: ");
            vector[i] = in.nextInt();

            if (i == 0){
                big = vector[i];
                sml = vector[i];
            }
            else if (vector[i] > big){
                big = vector[i];
            }
            else if(vector[i] < sml){
                sml = vector[i];
            }
        }

        System.out.println("O maior número é: " + big + " e o menor é: " + sml);

    }
}