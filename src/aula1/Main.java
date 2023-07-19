package aula1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("A temperatura é igual a %.1fºC", pedeTemperatura());
    }
    public static double pedeTemperatura(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Fahrenheit: ");
        double grausF  = scanner.nextDouble();
        return calculaParaCelcius(grausF);
    }
    public static double calculaParaCelcius(double grausF){
        double grausC = 5 * ((grausF - 32.0) / 9.0);
        return grausC;
    }
}