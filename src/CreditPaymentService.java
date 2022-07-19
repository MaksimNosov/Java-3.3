public class CreditPaymentService {
    public static double calculatePMT(double nper, double sum) { //водим срок кредита в месяцах и сумму кредита в рублях//
        double rate = 0.0999; //годовая процентная стака//
        double v = (1 + (rate / 12));
        double t = (-(nper / 12) * 12);
        double result = (sum * (rate / 12)) / (1 - Math.pow(v, t));
        return result;
    }
    }


