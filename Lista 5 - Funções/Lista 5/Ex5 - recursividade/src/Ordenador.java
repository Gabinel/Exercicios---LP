public class Ordenador {

    int[] ordenar(int[] array, int length, int i, int j){

        if (array[i] > array[j]){
            int aux = array[i];
            array[i] = array[j];
            array[j] = aux;
        } else if (i == length - 2) {
            return array;
        }

        j++;

        if (j == length - 1) {
            i++;
            j = i;
        }

        return ordenar(array, length, i, j);

    }

    int buscar(int[] array, int length, int number){

    }

}
