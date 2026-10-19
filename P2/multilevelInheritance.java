
class Person {
    String name = "Rahul";

    void showPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int empId = 101;

    void showEmployee() {
        System.out.println("Employee ID: " + empId);
    }
}

class Manager extends Employee {
    String department = "IT";

    void showManager() {
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.showPerson();
        m.showEmployee();
        m.showManager();
    }
}
