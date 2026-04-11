package strategy;

import java.util.Date;

import enums.PaymentMethod;

public class CardPayment implements PaymentStrategy {
    private String cardNumber;
    private String nameOnCard;
    private Date dateOfExpiry;

    @Override
    public boolean processPayment(double amount){
        System.out.println("This is card payment");
        return true;
    }

    private PaymentMethod paymentMethod = PaymentMethod.CARD;
    
    @Override
    public PaymentMethod getPaymentMethod()
    {
        return paymentMethod;
    }
}
