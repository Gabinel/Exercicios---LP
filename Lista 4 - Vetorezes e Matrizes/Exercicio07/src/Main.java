import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaração de um vetor e suas posições
        int [] [] matrix = new int [5] [5];
        int bigCol = 0, bigLin = 0, sum = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite 25 números, separados por espaço:");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = in.nextInt();
            }
        }

        /*
        matrix.length = comprimento das linhas
        matrix[0].length = comprimento das colunas

        'k' recebe o valor do comprimento das LINHAS, e 'l' o das COLUNAS.
        */
        for (int k = 0; k < matrix.length; k++) {

            /*
            'sum' receberá o valor contido em 'matriz[k][l]', pois 'l' está no segundo 'for',
            e consequentemente alcançará o limite (5) primeiro, ou seja, passa por todas as colunas
            em uma linha, somando todos os seus termos.
             */
            for (int l = 0; l < matrix[0].length; l++){
                sum = matrix[k][l] + sum;
            }

            if (k == 0){
                bigLin = sum;
            }
            else if (sum > bigLin){
                bigLin = sum;
            }
            sum = 0;
        }

        /*
        'm' vai até o comprimento das COLUNAS, que também é 5
        Caso m recebesse o comprimento das LINHAS, o resultado seria o mesmo, por ser uma matriz
        quadrada (possui o mesmo comprimento para linhas e colunas)
        */
        for (int m = 0; m < matrix[0].length; m++) {

            /*
            A diferença aqui será que 'sum' receberá o valor contido em 'matriz[n][m]', pois 'n' é
            inicializada no segundo for, fazendo com que alcance o limite (5) primeiro e, portanto, soma
            todas as colunas
             */
            for (int n = 0; n < matrix.length; n++){
                sum = matrix[n][m] + sum;
            }

            if (m == 0){
                bigCol = sum;
            }
            else if (sum > bigCol){
                bigCol = sum;
            }
            sum = 0;
        }

        System.out.println("A maior soma entre as linhas é: " + bigLin +
                ", e entre as colunas é: " + bigCol);

    }
}