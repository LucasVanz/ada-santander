package aula7;
import java.util.Scanner;

public class Aula7Ex01 {
    public static void main(String[] args) {
        System.out.println("Digite um dia da semana:");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(Semana2.enumDiaSemana2(scanner.nextLine()));
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

