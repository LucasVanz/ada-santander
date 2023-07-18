public class Exercicio3Aula3 {
    public static double calculoSalario( double[] input) {
        double tempoServico = input[0];
        double valorInflacao = input[1];
        double salarioFunc = input[2];
        double aumento = 0;
        if (tempoServico >= 1 && tempoServico < 5){
            aumento = salarioFunc + (salarioFunc * 0.01) + (salarioFunc * (valorInflacao/100)) ;
        } else if (tempoServico >= 5 && tempoServico < 10){
            aumento = salarioFunc + (salarioFunc * 0.015) + (salarioFunc * (valorInflacao/100));
        } else if (tempoServico >= 10) {
            aumento = salarioFunc + (valorInflacao * 0.02) + (valorInflacao * (valorInflacao/100));
        }
        return Math.round(aumento * 100.0) / 100.0;
    }
}
