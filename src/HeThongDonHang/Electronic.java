package HeThongDonHang;

public class Electronic extends Product implements Dicountable,InstallmentAvailable{

    public Electronic(String name, double originalPrice) {
        super(name, originalPrice);
    }

    @Override
    public double getShippinngFee() {
        return getOriginalPrice() * 0.1;
    }

    @Override
    public int getInstallmentMonths() {
        return 12;
    }

    @Override
    public double getMonthlyInstallment() {
        double finalPrice = getFinalFee();
        double discount = finalPrice * getDiscountPercent();
        return (finalPrice - discount) / getInstallmentMonths();
    }

    @Override
    public double getDiscountPercent() {
        return 0.1;
    }
}
