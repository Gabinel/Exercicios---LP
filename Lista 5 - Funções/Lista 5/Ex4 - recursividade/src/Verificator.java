public class Verificator {

    String withoutSpaces = "";
    char removingSpaces;

    String removeSpaces (String text, int i){

        if(i == text.length())
            return withoutSpaces;
        else
            if(text.toCharArray()[i] != ' '){
                removingSpaces = text.toCharArray()[i];
                withoutSpaces += removingSpaces;
            }

        i++;

        return removeSpaces(text, i);
    }

    boolean verify (String text, int i, int j){

        if (text.toCharArray()[i] != text.toCharArray()[j])
            return false;
        else if (i == text.length() - 1)
            return true;

        i++;
        j--;

        return verify(text, i, j);

    }

}
