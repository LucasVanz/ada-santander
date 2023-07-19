package aula2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        String[] frutasPromocao = {"Peras", "Laranjas", "Maçãs", "Tomates", "Caquis"};
        double [] precoFruta = new double[frutasPromocao.length];
        for (int i = 0; i < frutasPromocao.length; i++){
            System.out.println("Quantas " + frutasPromocao[i] + " irá levar:");
            precoFruta[i] = valorFruta(scanner.nextInt());
        }
        System.out.printf("O valor total a pagar é de R$ %.2f", calculaValorTotal(precoFruta));
    }
    public static double valorFruta(int quantidade){
        double precoFrutas;
        if (quantidade > 10){
            precoFrutas = 1.25 * quantidade;
        }else{
            precoFrutas = 1.45 * quantidade;
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
