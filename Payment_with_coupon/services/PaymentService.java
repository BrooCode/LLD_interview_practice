package services;
import java.util.UUID;

import enums.PaymentMethod;
import enums.PaymentStatus;
import models.*;
import strategy.DiscountStrategy;
import strategy.PaymentStrategy;

public class PaymentService {

    public Transaction processPayment(Order order,PaymentStrategy paymentMethod, DiscountStrategy coupon)
    {
        double baseAmount = order.getBaseAmount();
        double discount = 0.0;

        if (coupon != null) {
            discount = coupon.calculateDiscount(baseAmount);
            System.out.println("Discount applied: $" + discount);
        }

        double finalPayableAmount = baseAmount - discount;
        System.out.println("Final amount to pay: $" + finalPayableAmount);

        boolean isPaymentSuccessful = paymentMethod.processPayment(finalPayableAmount);

        String txnId = UUID.randomUUID().toString();
        PaymentStatus status = isPaymentSuccessful ? PaymentStatus.SUCCESS : PaymentStatus.FAILED;

        return new Transaction(txnId, order.getUserId(), order.getOrderId(), 
                       PaymentStrategy.getPaymentMethod(),status,finalPayableAmount);
    }
    
}
