public class Rectangle {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        double area;
        return area = this.width * this.height;
    }

    public double getPerimeter() {
        double perimeter;
        return perimeter = (this.width + this.height) * 2;
    }

    public static void main(String[] args) {
        Rectangle hcn1 = new Rectangle(5,6);
        Rectangle hcn2 = new Rectangle(7.5,4);

        System.out.printf("Diện tích hình chữ nhật 1: " + hcn1.getArea() + "\n");
        System.out.printf("Diện tích hình chữ nhật 2: " + hcn2.getArea() + "\n");
        System.out.printf("Chu vi hình chữ nhật 1: " + hcn1.getPerimeter() + "\n");
        System.out.printf("Chu vi hình chữ nhật 2: " + hcn2.getPerimeter() + "\n");
    }
}