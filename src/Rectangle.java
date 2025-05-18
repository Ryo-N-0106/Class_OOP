public class Rectangle {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void getArea() {
        double area = this.width * this.height;
        System.out.printf("Diện tích hình chữ nhật: " + area + "\n");
    }

    public void getPerimeter() {
        double perimeter = (this.width + this.height) * 2;
        System.out.printf("Chu vi hình chữ nhật: " + perimeter + "\n");
    }

    public static void main(String[] args) {
        Rectangle hcn1 = new Rectangle(5,6);
        Rectangle hcn2 = new Rectangle(7.5,4);

        hcn1.getArea();
        hcn1.getPerimeter();
        hcn2.getArea();
        hcn2.getPerimeter();
    }
}