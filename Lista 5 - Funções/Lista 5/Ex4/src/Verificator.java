public class Verificator {

    String inversed = "", withoutSpaces = "";
    char inversion, removingSpaces;

    String inversion (String text){

        for(int i = text.length() - 1; i >= 0; i--){
            removingSpaces = text.charAt(i);

            if (text.charAt(i) != ' '){
                withoutSpaces += removingSpaces;
            }

        }

        for(int i = withoutSpaces.length() - 1; i >= 0; i--){
            inversion = withoutSpaces.charAt(i);

            inversed += inversion;
        }

        if(withoutSpaces.equals(inversed)){
            System.out.println(text + " é um palíndromo!");
        } else {
            System.out.println(text + " não é um palíndromo!");
        }

        return inversed;

    }

}