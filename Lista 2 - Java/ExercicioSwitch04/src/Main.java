import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double price, discount, interestRate; //interestRate - taxa de juros
        int option, installment; //installment - desconto

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor da compra: ");
        price = in.nextDouble();

        System.out.println("Menu:");
        System.out.println("1. Débito");
        System.out.println("2. Pix");
        System.out.println("3. Crédito");

        System.out.println(" ");

        System.out.println("Escolha a forma de pagamento: ");
        option = in.nextInt();

        switch (option){
            case 1:
                discount = 0.05;
                System.out.println("Débito selecionado");
                System.out.println("Valor final da compra: " + ( price - price * discount));

                break;

            case 2:
                discount = 0.1;
                System.out.println("Pix selecionado");
                System.out.println("Valor final da compra: " + (price - price * discount));

                break;

            case 3:
                System.out.println("Crédito selecionado");
                System.out.println("Escolha o número de parcelas: ");
                installment = in.nextInt();

                if (installment <= 4){
                    interestRate = 0.02;
                }
                else{
                    interestRate = 0.05;
                }
                System.out.println("Valor final da compra: " + (price + (price * interestRate * installment)));

                break;

            default:
                System.out.println("Opção de pagamento inválida!");
        }
    }
}