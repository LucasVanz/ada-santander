package aula6;

import java.util.Scanner;

public class Aula6Ex03 {
    public static void main(String[] args) {
        System.out.println("Digite um dia da semana:");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(Semana.enumDiaSemana(scanner.nextLine()));
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
