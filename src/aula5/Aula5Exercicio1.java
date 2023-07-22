package aula5;

import java.util.Scanner;

public class Aula5Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.printf("Digite a quantidade de frutas que irá levar:");
        int quantidade = scanner.nextInt();
        try {
            validaQuantidade(quantidade);
            System.out.printf("O preço total a pagar é de R$ %.2f", valorFruta(quantidade));
        }catch (QuantidadeZeradaException | QuantidadeNegativaException e){
                System.out.println(e.getMessage());
        }
    }
    public static void validaQuantidade(int quantidade) throws QuantidadeZeradaException, QuantidadeNegativaException {
        if (quantidade == 0){
            throw new QuantidadeZeradaException("Não é possível realizar um pedido sem item");
        } else if (quantidade < 0) {
            throw new QuantidadeNegativaException("A quantidade de itens informados é inválida");
        }
    }
    public static double valorFruta (double input){
        double precoFrutas;
        if (input > 10) {
            precoFrutas = 1.25 * input;
        } else {
            precoFrutas = 1.45 * input;
        }
        return precoFrutas;
    }
}

