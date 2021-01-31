public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthlyPayment1 = service.calculate(1000_000, 9.99, 12);
        System.out.println(monthlyPayment1);

        double monthlyPayment2 = service.calculate(1000_000, 9.99, 24);
        System.out.println(monthlyPayment2);

        double monthlyPayment3 = service.calculate(1000_000, 9.99, 36);
        System.out.println(monthlyPayment3);
    }
}
