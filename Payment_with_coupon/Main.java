package client;

import models.Order;
import models.Transaction;
import services.PaymentService;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        
        PaymentService paymentService = new PaymentService();

        System.out.println("--- SCENARIO 1: Credit Card + Percentage Discount ---");
        // Create an order for $200
        Order order1 = new Order("ORD-1001", "USER-99", 200.0);
        
        // User selects Credit Card and applies a "20% off up to $30" coupon
        PaymentStrategy ccPayment = new CreditCardPayment("4111-2222-3333-4444", "123", "12/26");
        DiscountStrategy festiveCoupon = new PercentageDiscount(20.0, 30.0); 

        // Process the transaction
        Transaction txn1 = paymentService.processOrderPayment(order1, ccPayment, festiveCoupon);
        System.out.println(txn1.toString());
        
        
        System.out.println("\n--- SCENARIO 2: UPI + Flat Amount Discount ---");
        // Create an order for $50
        Order order2 = new Order("ORD-1002", "USER-42", 50.0);
        
        // User selects UPI and applies a "$10 off" coupon
        PaymentStrategy upiPayment = new UPIPayment("user@okbank");
        DiscountStrategy welcomeCoupon = new FlatAmountDiscount(10.0);

        // Process the transaction
        Transaction txn2 = paymentService.processOrderPayment(order2, upiPayment, welcomeCoupon);
        System.out.println(txn2.toString());


        System.out.println("\n--- SCENARIO 3: UPI + NO Coupon ---");
        // Create an order for $150
        Order order3 = new Order("ORD-1003", "USER-77", 150.0);
        
        // User pays with UPI but has no coupon (pass null)
        Transaction txn3 = paymentService.processOrderPayment(order3, upiPayment, null);
        System.out.println(txn3.toString());
    }
}