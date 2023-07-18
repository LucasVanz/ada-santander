import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Exercicio2Aula3 {
    public static double[] custosCarro(double[] input) {
        double [] percentual = new double[2];
        double precoFinal = input[0];
        double precoDistribuidor = input[1];
        double precoimpostos = input[2];
        percentual[0] = (precoDistribuidor * 100.0) / precoFinal;
        percentual[1] = (precoimpostos * 100.0) / precoFinal;
        BigDecimal prcDistribuidor = new BigDecimal(percentual[0]).setScale(2, RoundingMode.DOWN);
        BigDecimal prcImpostos = new BigDecimal(percentual[1]).setScale(2, RoundingMode.DOWN);
        double [] percentualFinal = {prcDistribuidor.doubleValue(), prcImpostos.doubleValue()};
        return percentualFinal;
    }
}
