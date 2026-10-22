class FactorialCalculator {
    int number;

    FactorialCalculator(int num) {
        number = num;
    }

    long calculateFactorial() {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}

public class fact {
    public static void main(String[] args) {
        FactorialCalculator fc = new FactorialCalculator(5);
        System.out.println("Factorial of " + fc.number + " is: " + fc.calculateFactorial());
    }
}
