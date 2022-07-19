public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService ();
        System.out.println();
        System.out.println("Ежемесячный платеж при сумме кредита 1_000_000 руб. сроком на 1 год составит: " + CreditPaymentService.calculatePMT(12, 1_000_000) + " рублей");

        System.out.println();
        System.out.println("Ежемесячный платеж при сумме кредита 1_000_000 руб. сроком на 2 года составит: " + CreditPaymentService.calculatePMT(24, 1_000_000) + " рублей");

        System.out.println();
        System.out.println("Ежемесячный платеж при сумме кредита 1_000_000 руб. сроком на 3 года составит: " + CreditPaymentService.calculatePMT(36, 1_000_000) + " рублей");

    }
}
