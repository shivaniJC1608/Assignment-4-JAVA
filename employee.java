class Employee {
    int empId;
    String name;
    double salary;

    Employee(int id, String n, double s) {
        empId = id;
        name = n;
        salary = s;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
    }
}

class Employeee {
    int empId;
    String name;
    double salary;

    Employeee(int id, String n, double s) {
        empId = id;
        name = n;
        salary = s;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
    }
}

public class employee {
    public static void main(String[] args) {
        Employee emp = new Employee(5001, "John Doe", 75000.0);
        emp.displayDetails();
    }
}


