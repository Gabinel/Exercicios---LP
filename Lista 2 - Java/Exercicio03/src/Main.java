import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, n2, media;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        media = (n1 + n2)/2;

        System.out.println(media);
        if(media >= 50){
            System.out.println("Aprovado!");
        }
        else{
            System.out.println("Reprovado!");
        }
    }
}