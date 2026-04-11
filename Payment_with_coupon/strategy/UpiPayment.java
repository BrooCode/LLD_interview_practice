package strategy;

import enums.PaymentMethod;

public class UpiPayment implements PaymentStrategy{
    @Override
    public boolean processPayment(double amount){
        System.out.println("This is UPI payment!");
        return true;
    }
    private PaymentMethod paymentMethod = PaymentMethod.UPI;
    
    @Override
    public PaymentMethod getPaymentMethod()
    {
        return paymentMethod;
    }
}
