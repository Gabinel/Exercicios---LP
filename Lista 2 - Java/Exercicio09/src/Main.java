import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, n2, n3;
        boolean triangle;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite três valores: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();
        n3 = in.nextDouble();

        triangle = n1 < (n2 + n3) && n2 < (n1 + n3) && n3 < (n1 + n2) &&
          n1 > Math.abs(n2 - n3) && n2 > Math.abs(n1 - n3) && n3 > Math.abs(n2 - n3) ; //Condição de existência de um triângulo

        if(triangle){
            System.out.print("Os lados podem formar um triângulo: ");

            if (n1 == n2 && n2 == n3){ //Todos os lados iguais
                System.out.println("equilátero!");
            }
            else if (n1 == n2 || n1 == n3 || n2 == n3) { //Dois lados iguais
                System.out.println("isósceles!");
            }
            else{ //Todos diferentes
                System.out.println("escaleno!");
            }
        }
        else{
            System.out.println("Não foi possível com tais valores formar um triângulo ;-;");
        }

    }
}