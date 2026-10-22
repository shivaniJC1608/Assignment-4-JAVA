class NumberChecker {
    int number;

    NumberChecker(int num) {
        number = num;
    }

    void checkEvenOdd() {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}

public class even_odd {
    public static void main(String[] args) {
        NumberChecker nc = new NumberChecker(7);
        nc.checkEvenOdd();
    }
}
