public class Main {
    public static void main(String[] args) {

        //Declaração de um vetor e suas posições
        int [] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i < vector.length; i++){
            if((i + 1) % 2 == 0){
                System.out.println(vector[i] + 2);
            }
            else{
                System.out.println(vector[i] * 2);
            }
        }

    }
}