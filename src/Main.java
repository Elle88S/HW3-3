public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sumCredit = 1_000_000;
        int period = 12;
        double percentRate = 9.99;
        double mounthPayment = service.calculate(sumCredit, period, percentRate);
        System.out.println(mounthPayment);
    }
}
