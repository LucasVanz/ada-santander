import java.util.Scanner;

public class Exercicio1Aula3 {
        public static double valorFruta(double input){
            double precoFrutas;
            if (input > 10){
                precoFrutas = 1.25 * input;
            }else{
                precoFrutas = 1.45 * input;
            }
            return precoFrutas;
        }
        public static double calculaValorTotal(double [] precoFruta){
            double valorTotal = 0;
            for (int j = 0; j < precoFruta.length; j++){
                valorTotal = valorTotal + precoFruta[j];
            }
            return valorTotal;
        }
    }

