class Addition {
    int num1;
    int num2;

    Addition(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    int getSum() {
        return num1 + num2;
    }
}

public class add {
    public static void main(String[] args) {
        Addition obj = new Addition(15, 25);
        System.out.println("Sum: " + obj.getSum());
    }
}
