import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, cont = 0;
        double div;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        n1 = in.nextInt();

        for (int i = 1; i <= n1; i++){

            //Se a divisão de n1 por i tiver resto 0, adicionar '1' à variável 'cont'
            if ((n1 % i) == 0){
                cont++;
            }

        }

        //Caso houver apenas 2 divisões que dão resto 0 (por 1 e por ele mesmo), é primo
        System.out.print("O número: " + n1);
        if (cont == 2){
            System.out.println(" é primo!");
        }
        else{
            System.out.println(" não é primo!");
        }

    }
}