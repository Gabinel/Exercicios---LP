import java.util.Scanner;
import java.util.Arrays; //Biblioteca para método por array

public class Main {
    public static void main(String[] args) {

        int n1, n2, n3;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite três números inteiros: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();


        if(n1 < n2 && n1 < n3){
            System.out.print(n1 + " < ");

            if(n2 < n3){
                System.out.print(n2 + " < " + n3);
            }
            else{
                System.out.print(n3 + " < " + n2);
            }
        }
        else if (n2 < n1 && n2 < n3) {
            System.out.print(n2 + " < ");

            if(n1 < n3){
                System.out.print(n1 + " < " + n3);
            }
            else{
                System.out.print(n3 + " < " + n1);
            }
        }
        else if (n1 == n2 && n2 == n3){
            System.out.println(n1 + " = " + n2 + " = " + n3 + ", todos são iguais!");
        }
        else{
            System.out.print(n3 + " < ");

            if(n1 < n2){
                System.out.print(n1 + " < " + n2);
            }
            else{
                System.out.print(n2 + " < " + n1);
            }
        }

        /* Método por array
        Integer[] ordem = { n1, n2, n3 }; //Armazena os valores digitados
        Arrays.sort(ordem); //Os ordena
        System.out.println(Arrays.toString(ordem)); //Converte e plota os valores
        */

    }
}