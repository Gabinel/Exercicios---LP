import java.sql.SQLOutput;
import java.util.Scanner; //Importa o feature "Scanner" da pasta "util" no java
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        double a, b, c, delta, result1, result2;
        while (true) {
            Scanner in = new Scanner(System.in); //Inicia um novo Scanner que lerá dados

            System.out.println("Digite os coeficientes a, b e c de uma equação do segundo grau : ");
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();

            delta = Math.pow(b,2) - (4 * a * c);
            result1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
            result2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);

            if(delta > 0){
                System.out.println("As raízes da equação são = " + result1 + " " + result2);
                break; //Como um resultado dentro do conjunto dos reais foi exibido, finaliza o programa
            }
            //Caso delta for igual a 0, terá uma raíz possível
            else if(delta == 0){
                System.out.println("A raíz da equação é =" + result1);
                break;
            }
            //Caso delta seja negativo, não possui raíz no conjunto dos reais
            else{
                System.out.println("O valor de delta resultou em " + delta + ", e por ser negativo, não possui raíz! "
                        + "Tente novamente!");
            }
        }

    }
}