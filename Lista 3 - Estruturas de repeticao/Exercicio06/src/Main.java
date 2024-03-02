import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, big, sml;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        n1 = in.nextInt();

        System.out.println("Digite outro número inteiro: ");
        n2 = in.nextInt();

        System.out.println("Os números entre os digitados são: ");

        if(n1 > n2 + 1){
            big = n1;
            sml = n2;
        }
        else if(n2 > n1 + 1){
            big = n2;
            sml = n1;
        }
        else{
            System.out.println("O intervalo entre os números é menor que 1!");
            return;
        }

        for (int i = sml + 1; i < big; i++){
            System.out.println(i);
        }

    }
}