public class Calc {

    int power(int base, int power){

        if (power == 0)
            return 1;
        else
            return base * power(base, (power - 1));

    }

}
