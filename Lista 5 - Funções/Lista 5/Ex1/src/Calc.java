public class Calc {

    public int sum = 0;

    int Soma(int n){
        for (int i = 1; i <= n; i++){
            sum += i;
        }

        return sum;
    }

}
