import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaração de um vetor e suas posições
        int [] [] matrix = new int [5] [5];

        Scanner in = new Scanner(System.in);

        System.out.println("Digite 25 números, separados por espaço:");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = in.nextInt();
            }
        }

        for (int k = 0; k < matrix.length; k++){
            System.out.println(matrix[k][k]);
        }

    }
}