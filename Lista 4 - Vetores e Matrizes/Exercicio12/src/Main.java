import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] [] matrix = new int [3] [3];
        //int [] [] detMatrix = new int [3] [5];
        int detFirst = 0, detSec = 0, mult = 1;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite 9 números, separados por espaço:");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = in.nextInt();
            }
        }

        /*
        //Completa 'matrix' com a primeira e segunda coluna duplicadas, em uma nova matriz 'detMatrix'
        for (int k = 0; k < detMatrix.length; k++){
            for (int l = 0; l < detMatrix[0].length; l++){
                detMatrix[k][l] = in.nextInt();

                if (l >= 3){
                    detMatrix[k][l] = matrix[k][l-3];
                }
            }
        }
         */

        for (int k = 0; k < matrix.length; k++){
            for (int l = 0; l < matrix[0].length; l++){
                if (l > 1 && k == 1){
                    mult = matrix[0][l] * mult;
                } else if (l >= 1 && k == 2){
                    mult = matrix[0][l] * mult;
                } else {
                    mult = matrix[l][l + k] * mult;
                }

                detFirst = mult + detFirst;

            }
        }

        mult = 1;

        for (int m = 0; m < matrix.length; m++){
            for (int n = (matrix.length - 1); n >= 0; n--){
                if (n == 2 && m == 1){
                    mult = matrix[0][0] * mult;
                } else if (n >= 1 && m == 2){
                    mult = matrix[0][n - 1] * mult;
                } else {
                    mult = matrix[n][n + m] * mult;
                }

                detSec = mult + detSec;

            }
        }

        System.out.println("A determinante da matriz é: " + (detFirst - detSec));

    }





}