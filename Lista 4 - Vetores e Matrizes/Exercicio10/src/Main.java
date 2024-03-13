import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] [] matrix1 = new int [3] [2];
        int [] [] matrix2 = new int [2] [2];
        int mult, sum = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite 6 números, separados por espaço:");
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                matrix1[i][j] = in.nextInt();
            }
        }

        System.out.println("Digite 4 números, separados por espaço:");
        for (int k = 0; k < matrix2.length; k++){
            for (int l = 0; l < matrix2[0].length; l++){
                matrix2[k][l] = in.nextInt();
            }
        }

        System.out.println(" ");

        for (int[] m : matrix1) {

            for (int n = 0; n < matrix2[0].length; n++) {

                for (int o = 0; o < matrix1[0].length; o++) {
                    mult = m[o] * matrix2[o][n];
                    sum = mult + sum;
                }

                System.out.print(sum + " ");
                sum = 0;

            }

            System.out.println(" ");

        }
    }
}