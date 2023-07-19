package aula4;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Aula5Ex2 {
    public static void main(String[] args) {
        double[][] entradas = {
                {1, 5.0, 2000.00},
                {11, 4.5,2500.00},
                {5.1, 6.7, 4500.0},
                {1, 5.7, 4800.0},
                {10.1, 4.7, 4100.0},
                {15, 5.3, 6100.0},
                {2, 8.3, 9500.0},
                {20, 9.3, 10500.0},
                {0.5, 11.3, 4800.0},
                {5, 12.5, 6800.0},
                {10, 9.1, 8200.0}
        };

        double[] saidas = {
                2120.00,
                2662.50,
                4869.00,
                5121.60,
                4374.70,
                6545.30,
                10383.50,
                11686.50,
                5342.4,
                7752.00,
                9110.20
        };
        for (int i = 0; i < entradas.length; i++) {
            double resultado = calculoSalario(entradas[i]);
            double esperado = saidas[i];

            System.out.println("Resultado: " + resultado);
            System.out.println("Esperado: " + esperado);
            System.out.println(resultado == esperado);
            System.out.println();
        }
    }

    public static double calculoSalario(double[] input) {
        double tempoServico = input[0];
        double valorInflacao = input[1];
        double salarioFunc = input[2];
        double aumento = 0;
        if (tempoServico >= 1 && tempoServico < 5){
            aumento = salarioFunc + (salarioFunc * 0.01) + (salarioFunc * (valorInflacao/100)) ;
        } else if (tempoServico >= 5 && tempoServico < 10){
            aumento = salarioFunc + (salarioFunc * 0.015) + (salarioFunc * (valorInflacao/100));
        } else if (tempoServico >= 10) {
            aumento = salarioFunc + (salarioFunc * 0.02) + (salarioFunc * (valorInflacao/100));
        } else if (tempoServico < 1){
            aumento = salarioFunc + (salarioFunc * (valorInflacao/100));
        }
        return arredondar(aumento);
    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.##", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }
}
