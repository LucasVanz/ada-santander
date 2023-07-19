package aula3;

import java.util.Scanner;
public class Exercicio3Aula6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite lado A: ");
        double ladoA = scanner.nextDouble();
        System.out.println("Digite lado B: ");
        double ladoB = scanner.nextDouble();
        System.out.println("Digite lado C:");
        double ladoC = validaLadoC(scanner.nextDouble(), ladoA, ladoB);
        System.out.printf("Area = %.2f metros quadrados", perimetroTriangulo(ladoA,ladoB,ladoC));
    }
    public static double validaLadoC(double ladoC, double ladoA, double ladoB){
        if (ladoC > (ladoA + ladoB)){
            throw new RuntimeException("O último lado do trinângulo deve ser menor que a soma de seus lados");
        }
        return ladoC;
    }
    public static double perimetroTriangulo(double ladoA, double ladoB, double ladoC){
        return calculaArea(((ladoA + ladoB + ladoC) / 2), ladoA, ladoB, ladoC);
    }
    public static double calculaArea(double perimetro,double ladoA, double ladoB, double ladoC){
        return Math.sqrt(perimetro * (perimetro - ladoA) * (perimetro - ladoB) * (perimetro - ladoC));
    }
}
