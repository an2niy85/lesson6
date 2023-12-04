package org.example.isp;

public class CustomPaymentService extends PaymentSrv implements CreditCardPaymentService, WebMoneyPaymentService {
    @Override
    public void payWebMoney(int amount) {
        System.out.printf("CustomProvider pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("CustomProvider pay by credit card %d\n", amount);
    }
}
