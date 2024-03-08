import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaração de um vetor e suas posições
        int [] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n1, cont = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        n1 = in.nextInt();

        for(int i = 0; i < vector.length; i ++){
            if(vector[i] == n1){
                System.out.println("O seu número está localizado na posição: " + i + "!");
                cont++;
            }
        }

        if (cont == 0){
            System.out.println("Seu número não está localizado no vetor!");
        }

    }
}