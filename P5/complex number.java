class ComplexNumber {
    double real, imaginary;

    ComplexNumber(double r, double i) {
        real = r;
        imaginary = i;
    }

    ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(real + c.real, imaginary + c.imaginary);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(4, 5);
        ComplexNumber c2 = new ComplexNumber(3, 2);

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        ComplexNumber sum = c1.add(c2);

        System.out.print("Sum: ");
        sum.display();
    }
}
