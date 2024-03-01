import java.util.Scanner; //Importa o feature "Scanner" da pasta "util" no java

public class Main {
    public static void main(String[] args) {

        double n1, n2, p1 = 1, p2 = 2, max_limit = 10, min_limit = 0, result;

        while (true){
            Scanner in = new Scanner(System.in); //Inicia um novo Scanner que lerá dados

            System.out.println("Digite dois números : ");
            n1 = in.nextDouble();
            n2 = in.nextDouble();
            result = ((n1 * p1) + (n2 * p2)) / (p1 + p2);

            if (result <= max_limit && result >= min_limit) { /*Se o resultado se encontrar entre o limite máximo e mínimo,
                                                            ou seja, estiver entre 10 e 0, exibe o resultado da média ponderada*/
                System.out.println("A média ponderada entre os dois números é = " + result);
                break; //Como o resultado deu entre 10 e 0, finaliza o programa
            }
            else if (result > max_limit) { //Se exceder o limite máximo
                System.out.println("A média ponderada entre os dois números, excedeu o limite máximo, que é = "
                        + max_limit + ", Tente novamente!");
            }
            else if (result < min_limit ) { //Se for abaixo do limite máximo
                System.out.println("A média ponderada entre os dois números excedeu o limite mínimo, que é = "
                        + min_limit + ", Tente novamente!");
            }
        }
    }
}