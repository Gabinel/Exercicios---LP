import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

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

        /*
        Caso o módulo de 'm - (comprimento_da_matrix - 1)' for igual a 'n', printa o número dentro de 'matrix'
        Ex: 'm = 0'. Caso: |1 - (5 - 1)| = 4 --> 4 = 4 -->  printa 'matrix[0][4]'
        E assim sucetivamente até printar a diagonal secundária inteira
         */
        for (int m = 0; m < matrix.length; m++){
            for (int n = 0; n < matrix[0].length; n++){

                if (Math.abs(m - (matrix.length - 1)) == n){
                    System.out.print(matrix[m][n] + " ");
                } else {
                    System.out.print(matrixEmpty[m][n] + " ");
                }


            }

            System.out.println(" ");
        }


    }
}