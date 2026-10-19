
class Device {
    void powerOn() {
        System.out.println("Device is powered on");
    }
}

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class SmartPrinter extends Device
        implements Printable, Scannable {

    public void print() {
        System.out.println("Smart printer is printing");
    }

    public void scan() {
        System.out.println("Smart printer is scanning");
    }
}

public class Main {
    public static void main(String[] args) {
        SmartPrinter s = new SmartPrinter();

        s.powerOn();
        s.print();
        s.scan();
    }
}
