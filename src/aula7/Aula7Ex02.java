package aula7;

public class Aula7Ex02 {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
        System.out.println(fatorial2(5));
    }
    public static int fatorial(int limite){
        int fatorial = 1;
        for(int i = limite; i > 0; i--){
           fatorial *= i;
        }
        return fatorial;
    }

    public static int fatorial2(int limite){
        if (limite == 0){
            return 1;
        }
        return limite * fatorial2(limite - 1);
    }
}
