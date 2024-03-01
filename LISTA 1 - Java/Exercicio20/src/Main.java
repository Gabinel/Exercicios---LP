import java.util.Scanner; //Importa o feature "Scanner" da pasta "util" no java

public class Main {
    public static void main(String[] args) {

        double x1, x2, coe_b, coe_c;

        Scanner in = new Scanner(System.in); //Inicia um novo Scanner que lerá dados

        System.out.println("Digite os as raízes de uma equação do segundo grau : ");
        x1 = in.nextDouble();
        x2 = in.nextDouble();

        coe_b = x1 + x2; //Cálculo do coeficiente B

        coe_c = x1 * x2; //Cálculo do coeficiente C

            if (coe_b >= 0){ /*Se as soma das raízes forem positivas, coeficiente B será
                                exibido negativo e o C positivo*/
                System.out.println("A equação é = x^2 " + "-" + coe_b + "x " + "+ " + coe_c);
            }
            else if (coe_b < 0 && x1 < 0 && x2 < 0){ /*Se as duas raízes forem negativas,
                                                    coeficiente B e C serão exibidos positivos*/
                System.out.println("A equação é = x^2 " + "+ " + coe_b + "x " + "+ " + coe_c);
            }
            else if(coe_b < 0 && (x1 >= 0 || x2 < 0) || (x1 < 0 || x2 >= 0)) { /*Se uma das raízes forem negativas,
                                                    coeficiente B será positivo e C negativo*/
                System.out.println("A equação é = x^2 " + "+ " + coe_b + "x " + coe_c);
            }


    }
}