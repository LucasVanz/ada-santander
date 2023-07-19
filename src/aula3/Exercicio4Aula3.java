package aula3;

public class Exercicio4Aula3 {
    public static int primeiroCaractereUnico(String input) {
        int j = 0;
        int i = 0;
        int aux = 0;
        for (i = 0; i < input.length() - 1; i++){
            aux = 0;
            for (j = 0; j < input.length(); j++){
                if (input.charAt(i) == input.charAt(j)){
                    aux ++;
                }
                System.out.println(aux);
            }
            if (aux == 1){
                break;
            }
        }
        return i;
    }
}
