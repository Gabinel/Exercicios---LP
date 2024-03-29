public class Ordenador {

    //BUBBLE SORTING para ordenar o vetor para crescente
    int[] ordenar (int[] array, int length){

        for (int i = 0; i < length; i++){
            for (int j = i; j < length; j++){
                if (array[i] > array[j]){
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }

        return array;

    }

    int busca (int[] array, int length, int number){

        int newLength = length, i = 0;

        //Enquanto ainda é possível dividir termos (Enquanto não for igual a 1)
        while (newLength > 1){

            //Caso seja PAR, apenas divide o vetor em 2
            if(newLength % 2 == 0){
                newLength /= 2;
            //Caso seja ÍMPAR, divide por dois (que irá truncar o resto) e soma com 1, dividindo o vetor em dois iguais
            } else {
                newLength = (newLength / 2) + 1;
            }

            //Se o número do meio da comparação for o número procurado, ele existe no vetor e retorna sua posição
            //Se 'i' for maior que '0', divide o vetor à direita (caso o nº procurado seja maior que o do meio)
            //Se 'i' for '0' quer dizer que ele é menor que o nº do meio, portanto, o processo de divisão do
                //comprimento do vetor segue normalmente
            if (array[newLength + i - 1] == number){
                return newLength + i - 1;
            //Se ele estiver à direita, ou seja, for MAIOR que o número do meio, guarda o comprimento em 'i'
            } else if (number > array[newLength + i - 1]) {
                i = newLength;
            }

        }

        return -1;

    }

}
