class MultiplicationTable {
    int number;

    MultiplicationTable(int num) {
        number = num;
    }

    void printTable() {
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

public class mul_table {
    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable(5);
        mt.printTable();
    }
}
