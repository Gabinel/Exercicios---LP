import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        int [] [] matrix = new int [3] [3];
        int detFirst = 0, detSec = 0, mult = 1;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite 9 números, separados por espaço:");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = in.nextInt();
            }
        }

        for (int k = 0; k < matrix.length; k++){

            /*Para multiplicação dos valores das diagonais, é usado a fórmula geral
            'mult = matrix[l][l + k] * mult'
            As excessões (valores duplicados da matriz) estão incluídos nos 'if - else'
             */
            for (int l = 0; l < matrix[0].length; l++){

                if (l == 2 && k == 1){
                    mult = matrix[l][0] * mult;
                }
                else if (l >= 1 && k == 2){
                    mult = matrix[l][l - 1] * mult;
                }
                else {
                    mult = matrix[l][l + k] * mult;

                }

            }

            detFirst = mult + detFirst;

            //Reseta o 'mult' para que a próxima diagonal seja calculada
            mult = 1;

        }

        /*
        Aqui é usado a mesma linha de raciocínio do exercício 9: para calcular a segunda diagonal
        da matriz é usada a fórmula '|n - (comprimentoDaMatriz - 1) + m|

        Exemplo: n = 0, m = 0:
        |0 - (3 - 1) + 0| => |-3| => -(-3) => 3

        Os valores duplicados da matriz estão incluídos nos 'if - else'
        */
        for (int m = 0; m < matrix.length; m++){

            for (int n = 0; n < matrix[0].length; n++){

                if (n == 0 && m == 1){
                    mult = matrix[0][0] * mult;
                }
                else if (n <= 1 && m == 2){
                    mult = matrix[n][m - (n + 1)] * mult;
                }
                else {
                    mult = matrix[n][Math.abs(n - (matrix[0].length- 1)) + m] * mult;
                }

            }

            detSec = mult + detSec;
            mult = 1;

        }

        System.out.println("A determinante da matriz é: " + (detFirst - detSec));

    }
}