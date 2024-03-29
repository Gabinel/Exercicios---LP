public class Calc {

    int sum (int number){

        if (number == 0)
            return 0;
        else
            return number + sum(number-1);

    }

}
