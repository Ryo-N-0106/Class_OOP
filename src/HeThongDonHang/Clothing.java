package HeThongDonHang;

public class Clothing extends Product{

    public Clothing(String name, double originalPrice) {
        super(name, originalPrice);
    }

    @Override
    public double getShippinngFee() {
        return 0;
    }
}
