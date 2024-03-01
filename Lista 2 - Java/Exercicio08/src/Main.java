import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        n1 = in.nextInt();

        if((n1 % 2) == 0){
            System.out.println("Seu número é par!");
        }
        else{
            System.out.println("Seu número é impar!");
        }
    }
}