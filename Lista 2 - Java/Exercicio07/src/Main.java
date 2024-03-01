import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        double a, b, c, delta, result1, result2;
            Scanner in = new Scanner(System.in);

            System.out.println("Digite os coeficientes a, b e c de uma equação do segundo grau : ");
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();

            delta = Math.pow(b,2) - (4 * a * c);
            result1 = ((-1 * b) + Math.sqrt(Math.abs(delta))) / (2 * a);
            result2 = ((-1 * b) - Math.sqrt(Math.abs(delta))) / (2 * a);

            if(delta > 0){
                System.out.println("As raízes da equação são = " + result1 + " " + result2);
            }
            //Caso delta for igual a 0, terá uma raíz possível
            else if(delta == 0){
                System.out.println("A raíz da equação é =" + result1);
            }
            //Caso delta seja negativo, não possui raíz no conjunto dos reais
            else{
                System.out.println("O valor de delta resultou em " + delta + ", e por ser negativo, não possui raíz! "
                        + "Tente novamente!");
            }

            /*
            else{
                System.out.println("As raízes da equação são: " + result1 + "i e " + result2 + "i");
            }

             */
    }
}