public class Calc {

    double power = 1;

    double power (double x, int y){

        for(int i = 0; i < Math.abs(y); i++){

            //Caso a potência seja negativa, multiplicar 'y' vezes por '1/x'
            if(y < 0){
                power *= (1/x);
            } else {
                power *= x;
            }

        }

        return power;

    }

}
