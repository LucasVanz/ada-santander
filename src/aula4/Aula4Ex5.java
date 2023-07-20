package aula4;

public class Aula4Ex5 {
    public static void main(String[] args) {
        String[] entradas = {
                "amor",
                "cocada",
                "mora",
                "ovo",
                "cachorro",
                "kaka",
                "saudades",
                "palalelepipedo",
                "fofocalizando",
                "papagaio",
                "ateiaateiab"
        };

        int[] saidas = {
                0,
                1,
                0,
                1,
                1,
                -1,
                2,
                9,
                4,
                4,
                10
        };

        for (int i = 0; i < entradas.length; i++) {
            double resultado = primeiroCaractereUnico(entradas[i]);
            double esperado = saidas[i];

            System.out.println("Resultado: " + resultado);
            System.out.println("Esperado: " + esperado);
            System.out.println(resultado == esperado);
            System.out.println();
        }
    }

    public static int primeiroCaractereUnico(String input) {
        int i;
        for (i = 0; i < input.length(); i++){
            int aux = 0;
            for (int j = 0; j < input.length(); j++){
                if (input.charAt(i) == input.charAt(j)){
                    aux ++;
                }
            }
            if (aux == 1){
                break;
            }else if(i == input.length() - 1){
                i = -1;
                break;
            }
        }
        return i;
    }
}
