import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double money, priceOpt1 = 0.5, priceOpt2 = 1.0, priceOpt3 = 2.5, priceOpt4 = 2.0;
        String textOpt1 = "Café Expresso", textOpt2 = "Café Longo", textOpt3 = "Capuccino", textOpt4 = "Chocolate";
        int option;
        boolean negative;

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o dinheiro (R$): ");
        money = in.nextDouble();

        System.out.println("Menu:");

        System.out.println("1. " + textOpt1 + " " + priceOpt1 + " R$");
        System.out.println("2. " + textOpt2 + " " + priceOpt2 + " R$");
        System.out.println("3. " + textOpt3 + " " + priceOpt3 + " R$");
        System.out.println("4. " + textOpt4 + " " + priceOpt4 + " R$");

        System.out.println(" ");

        System.out.println("Escolha a bebida: ");
        option = in.nextInt();

        //Caso o dinheiro inserido seja menor do que o preço da bebida selecionada
        negative = (money < priceOpt1 && option == 1) || (money < priceOpt2 && option == 2) ||
                (money < priceOpt3 && option == 3) || (money < priceOpt4 && option == 4);

        //Se o troco for negativo
        if (negative) System.out.println("Não foi possível comprar a bebida com o dinheiro inserido!");
        else {
            switch (option){
                case 1:
                    System.out.println("Bebida selecionada: " + textOpt1);
                    System.out.println("Seu troco: " + (money - priceOpt1));

                    break;

                case 2:
                    System.out.println("Bebida selecionada: " + textOpt2);
                    System.out.println("Seu troco: " + (money - priceOpt2));

                    break;

                case 3:
                    System.out.println("Bebida selecionada: " + textOpt3);
                    System.out.println("Seu troco: " + (money - priceOpt3));

                    break;

                case 4:
                    System.out.println("Bebida selecionada: " + textOpt4);
                    System.out.println("Seu troco: " + (money - priceOpt4));

                    break;

                default:
                    System.out.println("Opção de café inválida!");
            }
        }


    }
}