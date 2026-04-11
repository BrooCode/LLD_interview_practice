package models;

import enums.PaymentMethod;
import enums.PaymentStatus;

public class Transaction {
    private String transactionID;
    private String userID;
    private String orderID;
    private PaymentMethod paymentMethod;
    private PaymentStatus paymentStatus;
    private double finalAmountPaid;


    public Transaction(String transactionID, String userID, String orderID, 
                       PaymentMethod paymentMethod, PaymentStatus paymentStatus, 
                       double finalAmountPaid) {
        this.transactionID = transactionID;
        this.userID = userID;
        this.orderID = orderID;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        this.finalAmountPaid = finalAmountPaid;
    }
}
