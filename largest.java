class LargestFinder {
    int a;
    int b;

    LargestFinder(int num1, int num2) {
        a = num1;
        b = num2;
    }

    int findLargest() {
        return (a > b) ? a : b;
    }
}

public class Main {
    public static void main(String[] args) {
        LargestFinder lf = new LargestFinder(45, 82);
        System.out.println("Largest number is: " + lf.findLargest());
    }
}
