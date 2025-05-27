package HeThongDonHang;

public class Book extends Product implements Dicountable{

    public Book(String name, double originalPrice) {
        super(name, originalPrice);
    }

    @Override
    public double getDiscountPercent() {
        return 0.1;
    }

    @Override
    public double getShippinngFee() {
        return 30000;
    }
}
