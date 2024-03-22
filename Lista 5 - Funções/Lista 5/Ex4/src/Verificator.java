public class Verificator {

    String inversed = "";
    char inversion;

    String inversion (String text){

        for(int i = text.length() - 1; i >= 0; i--){
            inversion = text.charAt(i);

            inversed += inversion;
        }

        return inversed;

    }

}
