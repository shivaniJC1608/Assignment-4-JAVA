class SquareCalculator {
    int number;

    SquareCalculator(int num) {
        number = num;
    }

    int getSquare() {
        return number * number;
    }
}

public class sqr_num {
    public static void main(String[] args) {
        SquareCalculator sc = new SquareCalculator(6);
        System.out.println("Square of " + sc.number + " is: " + sc.getSquare());
    }
}
