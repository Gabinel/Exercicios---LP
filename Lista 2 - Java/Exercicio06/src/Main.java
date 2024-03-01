import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, minLimit = 5, maxLimit = 9;
        String option5 = "Caneta", option6 = "Notebook", option7 = "Celular",
                option8 = "Calculadora", option9 = "Tênis";

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número entre: " + minLimit + " e " + maxLimit);
        n1 = in.nextInt();

        if(n1 == 5){
            System.out.println(option5);
        }
        else if (n1 == 6){
            System.out.println(option6);
        }
        else if (n1 == 7) {
            System.out.println(option7);
        }
        else if (n1 == 8) {
            System.out.println(option8);
        }
        else if (n1 == 9) {
            System.out.println(option9);
        }
        else{
            System.out.println("Número não se enquadra no limite pré-definido!");
        }

        /*
        switch (n1) {
            case 5:
                System.out.println(option5);

                break;

            case 6:
                System.out.println(option6);

                break;

            case 7:
                System.out.println(option7);

                break;

            case 8:
                System.out.println(option8);

                break;

            case 9:
                System.out.println(option9);

                break;

            default:
                System.out.println("Número não se enquadra no limite pré-definido!");
        }
         */
    }
}