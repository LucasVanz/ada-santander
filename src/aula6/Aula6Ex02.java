package aula6;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Aula6Ex02 {
    public static void main(String[] args) throws EstadoInvalidoException {

        System.out.println(valorProdutoFinal(250.10, "MG") == 267.607);
        System.out.println(valorProdutoFinal(250.10, "RJ") == 287.615);
        System.out.println(valorProdutoFinal(250.10, "SP") == 280.112);

        try {
            valorProdutoFinal(250.10, "DF");
        }catch (EstadoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
    public static double valorProdutoFinal(double valorProduto, String estado) throws EstadoInvalidoException {
        double taxa = 0;
        try {
            Estado estado1 = Estado.valueOf(estado);
            switch (estado) {
                case "MG":
                    taxa = 0.07;
                    break;
                case "SP":
                    taxa = 0.12;
                    break;
                case "RJ":
                    taxa = 0.15;
                    break;
            }
            return arredondar(valorProduto + (valorProduto * taxa));
        }catch (IllegalArgumentException e){
            throw new EstadoInvalidoException("Estado inválido");
        }
    }
    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }
}
