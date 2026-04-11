package strategy;

import enums.PaymentMethod;

public interface PaymentStrategy {
    boolean processPayment(double amount);

    PaymentMethod getPaymentMethod(); 
}
