class SimpleInterest {
    double principle;
    double rate;
    double time;

    SimpleInterest(double p, double r, double t) {
        principle = p;
        rate = r;
        time = t;
    }

    double calculateSI() {
        return (principle * rate * time) / 100;
    }
}

public class simple_interest {
    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest(10000, 5, 2);
        System.out.println("Simple Interest: " + si.calculateSI());
    }
}
