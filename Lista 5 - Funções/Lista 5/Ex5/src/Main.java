import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int length, busca, number;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        length = in.nextInt();

        int [] array = new int[length];

        for(int i = 0; i < length; i++){

            System.out.println("Digite o " + (i + 1) + " termo do vetor:");
            array[i] = in.nextInt();

        }

        //Instancia um novo objeto da classe "Ordenador"
        Ordenador ordem = new Ordenador();
        //Utiliza o método 'ordenar' do objeto 'ordem' para retornar o vetor ordenado
        // (via Bubble Sorting) para a String 'array'
        array = ordem.ordenar(array, length);

        System.out.println("Digite o número a ser procurado: ");
        number = in.nextInt();

        //Retorna o index do número no vetor (caso esteja nele) pelo método 'busca' de 'ordem'
        busca = ordem.busca(array, length, number);

        if(busca == -1){
            System.out.println("O número não foi encontrado!");
        } else {
            System.out.println("O número está na posição " + busca + " do vetor!");
        }

    }
}