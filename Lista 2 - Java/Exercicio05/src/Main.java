import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, n2, total_n = 2, media, limit = 10;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        media = (n1 + n2)/total_n;

        if(media > limit){
            System.out.println("Sua nota excedeu " + limit + ", tente novamente!");
        }
        else{
            System.out.print(media);

            if(media >= 8.5){
                System.out.println(" -> Nota A");
            }
            else if(media >= 7){
                System.out.println(" -> Nota B");
            }
            else if (media >= 5) {
                System.out.println(" -> Nota C");
            }
            else{
                System.out.println(" -> Nota D");
            }
        }
    }
}