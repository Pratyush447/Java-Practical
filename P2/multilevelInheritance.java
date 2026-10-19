class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    protected int employeeId;

    public Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    public void showEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    public void showManagerDetails() {
        System.out.println("Department: " + department);
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Manager manager = new Manager("Jordan Lee", 204, "Engineering");
        manager.introduce();
        manager.showEmployeeDetails();
        manager.showManagerDetails();
    }
}
