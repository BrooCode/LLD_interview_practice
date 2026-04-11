package strategy;

public class PercentageDiscount implements DiscountStrategy{
    private int percentage = 20;
    private int maxDiscount = 50; //Upto RS 50
    @Override
    public double calculateDiscount(double baseAmount){
        double discount = Math.min(baseAmount-(baseAmount % percentage),maxDiscount);
        return baseAmount-discount;
    }
}
