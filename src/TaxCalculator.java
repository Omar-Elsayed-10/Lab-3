import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculator {
    public static void main(String[] args) {
        // Constants
        double netPrice = 9.99;
        double vatRate = 0.23;
        int quantity = 10000;

        // --- 1. CALCULATION USING DOUBLE ---
        double grossPriceDouble = netPrice * (1 + vatRate);
        double totalGrossDouble = grossPriceDouble * quantity;
        double totalExcludingVatDouble = totalGrossDouble / (1 + vatRate);

        System.out.println("--- Results using DOUBLE ---");
        System.out.println("Gross Price (1 pc): " + grossPriceDouble);
        System.out.println("Total Gross (10k pcs): " + totalGrossDouble);
        System.out.println("Total Net (Excluding VAT): " + totalExcludingVatDouble);

        // --- 2. CALCULATION USING BIGDECIMAL ---
        // Note: Always use the String constructor for BigDecimal to maintain precision!
        BigDecimal netBD = new BigDecimal("9.99");
        BigDecimal vatBD = new BigDecimal("0.23");
        BigDecimal quantityBD = new BigDecimal("10000");
        BigDecimal one = new BigDecimal("1");

        BigDecimal grossPriceBD = netBD.multiply(one.add(vatBD));
        BigDecimal totalGrossBD = grossPriceBD.multiply(quantityBD);
        // Dividing back to net requires a rounding mode
        BigDecimal totalExcludingVatBD = totalGrossBD.divide(one.add(vatBD), 2, RoundingMode.HALF_UP);

        System.out.println("\n--- Results using BIGDECIMAL ---");
        System.out.println("Gross Price (1 pc): " + grossPriceBD);
        System.out.println("Total Gross (10k pcs): " + totalGrossBD);
        System.out.println("Total Net (Excluding VAT): " + totalExcludingVatBD);
    }
}