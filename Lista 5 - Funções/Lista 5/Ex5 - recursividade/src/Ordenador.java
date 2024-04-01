public class Ordenador {

    int[] ordenar(int[] array, int length, int i, int j){

        if (array[i] > array[j]){
            int aux = array[i];
            array[i] = array[j];
            array[j] = aux;
        }

        if (j == length - 1) {

            if (i == length - 1)
                return array;

            i++;
            j = i;
        } else if (j < length - 1) {
            j++;
        }


        return ordenar(array, length, i, j);

    }

    int buscar(int[] array, int length, int number, int i){

        if(length < 1)
            return -1;

        if (length % 2 == 0)
            length /= 2;
        else
            length = (length/2) + 1;

        if (array[length + i - 1] == number)
            return length + i - 1;
        else if (number > array[length + i - 1])
            i = length;

        return buscar(array, length, number, i);
    }

}
