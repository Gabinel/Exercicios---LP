import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, length, search;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        length = in.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++){

            System.out.println("Digite o " + (i + 1) + " termo do vetor: ");
            array[i] = in.nextInt();

        }

        System.out.println("Digite o número a ser procurado no vetor: ");
        number = in.nextInt();

        int[] arraySorted;
        Ordenador ordem = new Ordenador();
        arraySorted = ordem.ordenar(array, length, 0, 0);

        for (int i = 0; i< length; i ++){
            System.out.println(arraySorted[i]);
        }

        search = ordem.buscar(arraySorted, length, number, 0);

        if(search != - 1)
            System.out.println("O número está na posição: " + search + " do vetor!");
        else
            System.out.println("O número não está no vetor!");

    }
}