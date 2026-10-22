class Rectangle {
    double length;
    double width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double calculateArea() {
        return length * width;
    }
}

public class areaofREC {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 4.0);
        System.out.println("Area of Rectangle: " + rect.calculateArea());
    }
}
