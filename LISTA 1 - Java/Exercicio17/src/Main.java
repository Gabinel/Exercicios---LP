import java.util.Scanner; //Importa o feature "Scanner" da pasta "util" no java

public class Main {
    public static void main(String[] args) {

        double v_start, aceleration, path_time, result;

        Scanner in = new Scanner(System.in); //Inicia um novo Scanner que lerá dados

        System.out.println("Digite a velocidade inicial, a aceleração e o tempo de percurso : ");
        v_start = in.nextDouble();
        aceleration = in.nextDouble();
        path_time = in.nextDouble();

        result = v_start + (aceleration * path_time);

        System.out.println("A velocidade atual é = " + result);

    }
}