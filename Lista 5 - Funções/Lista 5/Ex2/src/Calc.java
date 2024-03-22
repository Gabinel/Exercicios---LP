public class Calc {

    int fact = 1;

    int factorial (int n){

        for (int i = 0; i < n; i++){

            fact *= (n-i);

        }

        return fact;

    }

}
