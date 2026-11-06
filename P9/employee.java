class Employee {
    String name;
    double salary;

    static int count = 0;

    Employee() {
        this("Unknown", 0.0);
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        count++;
    }
    
    void display() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: Rs. " + this.salary);
        System.out.println();
    }

    static void displayCount() {
        System.out.println("Total Employees Created: " + count);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee("Rahul", 25000);

        Employee e3 = new Employee("Amit", 35000);

        System.out.println("Employee 1:");
        e1.display();

        System.out.println("Employee 2:");
        e2.display();

        System.out.println("Employee 3:");
        e3.display();

        Employee.displayCount();
    }
}
