import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, j = 0, big = 0, sml = 0, total_n = 5;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite cinco números inteiros, separados por espaço: ");

        for (int i = 0; i < total_n; i++){
            n1 = in.nextInt();

            if(j == 0){
                big = n1;
                sml = n1;
                j++;
            }
            else if(n1 > big){
                big = n1;
            }
            else{
                sml = n1;
            }
        }

        System.out.println("Maior número = " + big + " e menor número = " + sml);

    }
}