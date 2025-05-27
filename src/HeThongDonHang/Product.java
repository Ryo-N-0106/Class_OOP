package HeThongDonHang;

public abstract class Product {
    private String name;
    private double originalPrice;
    private double shippingFee;

    public Product(String name, double originalPrice) {
        this.name = name;
        this.originalPrice = originalPrice;
    }

    public String getName() {
        return this.name;
    }

    public Double getOriginalPrice() {
        return this.originalPrice;
    }

    public Double getShippingFee() {
        return this.shippingFee;
    }

    public abstract double getShippinngFee();

    public double getFinalFee() {
        return originalPrice + getShippinngFee();
    }
}
