import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, length;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        length = in.nextInt();

        int[] array = new int[length];
        int[] arraySorted = new int[length];

        for (int i = 0; i < length; i++){

            System.out.println("Digite o " + (i + 1) + " termo do vetor: ");
            array[i] = in.nextInt();

        }

        Ordenador ordem = new Ordenador();
        arraySorted = ordem.ordenar(array, length, 0, 1);

        for (int j = 0; j < length; j++)
            System.out.println(arraySorted[j] + ", ");


    }
}