public class exercicio5Aula3 {
    public static boolean elementosRepetidos(double[] input) {
        boolean repeteValor = false;
        for (int i = 0; i < input.length - 1; i++){
            int aux = 0;
            for (int j = 0; j < input.length - 1; j++){
                if (input[i] == input[j]){
                    aux++;
                }
            }
            if (aux >= 2){
                repeteValor = true;
                break;
            }
        }
        return repeteValor;
    }
}
