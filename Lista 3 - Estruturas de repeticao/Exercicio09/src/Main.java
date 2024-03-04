import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int answer, limit = 10;
        String playAgain;
        boolean response; //Variável que rege se a resposta da String foi válida (S ou N)

        Scanner in = new Scanner(System.in);

        for(int i = 1; i <= limit; i++){
            response = false;

            for(int j = 1; j <= limit; j++){
                System.out.println(i + " * " + j + " = ");

                System.out.println("Qual o resultado da multiplicação? ");
                answer = in.nextInt();

                if (answer == i * j){
                    System.out.println("Correto!");
                }
                else {
                    System.out.println("Incorreto, você perdeu ;-;");

                    do{
                        System.out.println("Jogar novamente? S ou N ?");
                        playAgain = in.next();

                        /*
                        Se quiser jogar de novo, coloca o valor inicial para o primeiro for
                        ( 0 + 1 = 1) e aumenta o valor do segundo for para acima do limite,
                        fazendo com que ele seja quebrado e reiniciado ao seu valor inicial
                        */
                        if (playAgain.equals("S") || playAgain.equals("s")){
                            i = 0;
                            j += limit;
                            response = true;
                        }
                        /*
                        Se não quiser jogar de novo, aumenta o valor dos dois 'for' para
                        acima do limite, quebrando os dois
                        */
                        else if (playAgain.equals("N") || playAgain.equals("n")){
                            i += limit;
                            j += limit;
                            response = true;
                        }
                    }while(!response); //Caso a resposta não seja 'S' ou 'N', pedir de novo a confirmação
                }
            }

            if (i == 10){
                System.out.println("Parabéns! Você venceu o jogo!");
            }

        }
    }
}