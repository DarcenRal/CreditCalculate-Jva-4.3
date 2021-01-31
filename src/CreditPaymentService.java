public class CreditPaymentService {
    public double calculate(int creditAmount, double percent, int months) {
        int year = 12;
        double monthPercent = percent/year/100;
        double monthlyPayment = creditAmount * monthPercent * Math.pow((1+monthPercent),months)/(Math.pow((1+monthPercent),months)-1);
        return (long) monthlyPayment;
    }
}
