package HeThongDonHang;

public class OrderSystem {
    public static void main(String[] args){
        Product[] products = {
                new Book("Introduction to Java",300000),
                new Electronic("Headphone",600000),
                new Clothing("Uniqlo",700000)
        };

        for (Product product : products) {
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getFinalFee());

            if (product instanceof Dicountable){
                Dicountable dicountable = (Dicountable) product;
                double discount = dicountable.getDiscountPercent();
                double priceAfterDiscount = product.getFinalFee() * (1 - discount);
                System.out.println("Chiết khấu: " + discount);
                System.out.println("Giá sau khi giảm: " + priceAfterDiscount + "\n");
            }

            if (product instanceof InstallmentAvailable) {
                InstallmentAvailable i = (InstallmentAvailable) product;
                int months = i.getInstallmentMonths();
                double monthly = i.getMonthlyInstallment();

                System.out.println("Trả góp " + months + " tháng với " + monthly + "/tháng");
            }
        }
    }
}
