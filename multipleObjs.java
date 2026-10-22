class Car {
    String brand;

    Car(String b) {
        brand = b;
    }

    void displayBrand() {
        System.out.println("Car Brand: " + brand);
    }
}

public class multipleObjs {
    public static void main(String[] args) {
        
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda");
        Car car3 = new Car("Ford");

        car1.displayBrand();
        car2.displayBrand();
        car3.displayBrand();
    }
}

