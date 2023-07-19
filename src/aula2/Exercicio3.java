package aula2;

import java.util.Arrays;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 1, 2, 3};
        int[] ascendingOrder = sortAscendingOrder(numbers);
        int[] descendingOrder = sortDescendingOrder(numbers);
        int[] oddNumbers = filterOddNumbers(numbers);
        int[] evenNumbers = filterEvenNumbers(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(ascendingOrder));
        System.out.println(Arrays.toString(descendingOrder));
        System.out.println(Arrays.toString(oddNumbers));
        System.out.println(Arrays.toString(evenNumbers));
    }

    public static int [] sortDescendingOrder(int[] numbers){
        int [] ordemDecrescente = numbers.clone();
        int aux;
        for (int i = 0; i < ordemDecrescente.length; i++){
            for (int j = 0; j < ordemDecrescente.length; j++){
                if (ordemDecrescente[i] > ordemDecrescente[j]){
                    aux = ordemDecrescente[i];
                    ordemDecrescente[i] = ordemDecrescente[j];
                    ordemDecrescente[j] = aux;
                }
            }
        }
        return ordemDecrescente;
    }
    public static int [] sortAscendingOrder(int [] numbers){
        int [] ordemCrescente = numbers.clone();
        int aux;
        for (int i = ordemCrescente.length - 1; i >= 0 ; i--){
            for (int j = ordemCrescente.length - 1; j >= 0; j--){
                if (ordemCrescente[i] > ordemCrescente[j]){
                    aux = ordemCrescente[i];
                    ordemCrescente[i] = ordemCrescente[j];
                    ordemCrescente[j] = aux;
                }
            }
        }
        return ordemCrescente;
    }

    public static int [] filterOddNumbers(int [] numbers){
        //fazer depois
        return numbers;
    }
    public static int [] filterEvenNumbers(int [] numbers){
        //fazer depois
        return numbers;
    }
}