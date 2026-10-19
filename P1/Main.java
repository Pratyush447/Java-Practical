public class Student {
    private int rollNumber;
    private String name;
    private double subject1Marks;
    private double subject2Marks;
    private double subject3Marks;

    public Student(int rollNumber, String name, double subject1Marks,
                   double subject2Marks, double subject3Marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    public double calculateTotalMarks() {
        return subject1Marks + subject2Marks + subject3Marks;
    }

    public double calculatePercentage() {
        return calculateTotalMarks() / 3.0;
    }

    public void displayDetails() {
        System.out.println("Roll number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Subject marks: " + subject1Marks + ", "
                + subject2Marks + ", " + subject3Marks);
        System.out.println("Total marks: " + calculateTotalMarks() + " / 300");
        System.out.printf("Percentage: %.2f%%%n", calculatePercentage());
    }

    public static void main(String[] args) {
        System.out.println("Class: Student");
        System.out.println("Instance variables: rollNumber, name, "
                + "subject1Marks, subject2Marks, subject3Marks");
        System.out.println("Constructor: Student(int, String, double, double, double)");
        System.out.println("Methods: calculateTotalMarks(), calculatePercentage(), "
                + "displayDetails()");

        Student student1 = new Student(101, "Asha", 85, 90, 88);
        Student student2 = new Student(102, "Ravi", 78, 82, 80);
        Student student3 = new Student(103, "Mina", 92, 95, 89);

        System.out.println("Objects: student1, student2, student3");

        System.out.println("\n--- Student 1 ---");
        student1.displayDetails();
        System.out.println("\n--- Student 2 ---");
        student2.displayDetails();
        System.out.println("\n--- Student 3 ---");
        student3.displayDetails();
    }
}
