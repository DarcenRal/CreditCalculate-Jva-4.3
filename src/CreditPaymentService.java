public class CreditPaymentService {
    public double calculate(int creditAmount, double percent, int months) {
        double monthPercent = percent/months/100;
        double monthlyPayment = creditAmount * monthPercent * Math.pow((1+monthPercent),months)/(Math.pow((1+monthPercent),months)-1);
        return (long) monthlyPayment;
    }
}
