class Demo {
    Demo() {
        System.out.println("Object Constructed");
    }

    void display() {
        System.out.println("Object is being used");
    }
}

public class Main {
    public static void main(String[] args) {
        Demo obj = new Demo();

        obj.display();

        obj = null;

        System.out.println("Object reference removed");

        System.gc();

        System.out.println("Garbage Collection Requested");
        System.out.println("Program Ended");
    }
}
