public class CreditPaymentService {
    public double calculate(int sumCredit, int period, double persentRate) {

        double mounthRate = persentRate / 12 / 100;

        double st2 = Math.pow((1 + mounthRate), period);
        double formul = (sumCredit * mounthRate) * (st2) / (st2 - 1);
        return (int) formul;
    }
}