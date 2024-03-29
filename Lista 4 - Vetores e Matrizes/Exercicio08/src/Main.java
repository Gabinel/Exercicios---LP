import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaração de um vetor e suas posições
        int [] [] matrix = new int [5] [5];
        char empty = '-';
        char [] [] matrixEmpty = new char [5] [5];

        Scanner in = new Scanner(System.in);

        System.out.println("Digite 25 números, separados por espaço:");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = in.nextInt();
            }
        }

        //Preenche a matrixEmpty com '-'
        for (int k = 0; k < matrixEmpty.length; k++){
            for (int l = 0; l < matrixEmpty[0].length; l++){
                matrixEmpty[k][l] = empty;
            }
        }

        System.out.println(" ");

        //Desenha apenas a diagonal, nos outros espaços printa '-' que está na matrixEmpty
        for (int m = 0; m < matrix.length; m++){
            for (int n = 0; n < matrix[0].length; n++){

                if (n == m){
                    System.out.print(matrix[n][n] + " ");
                } else {
                    System.out.print(matrixEmpty[m][n] + " ");
                }


            }

            System.out.println(" ");
        }


    }
}