package strategy;

public class FlatCoupon implements DiscountStrategy {
    private double discount = 100 ;
    @Override
    public double calculateDiscount(double baseAmount){
        return baseAmount-100;
    }
}
