package student.report;

import java.text.NumberFormat;
import java.util.Locale;

public class FeeCalculator {
    public String calculateFee(int totalCredits){
        long fee = totalCredits * 100L;
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("es", "ES"));
        return currencyFormatter.format(fee);
    }
}
