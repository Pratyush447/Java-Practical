//If both A and B provide a show() method, the compiler could face ambiguity about which implementation C should inherit.
//Java allows a class to implement multiple interfaces instead
interface A {
    void show();
}

interface B {
    void display();
}

class C implements A, B {
    public void show() {
        System.out.println("Show method");
    }

    public void display() {
        System.out.println("Display method");
    }
}
