class Product {
    String productName;
    double price;
    int quantity;

    Product() {
        productName = "Unknown";
        price = 0.0;
        quantity = 0;
    }

    Product(String name) {
        productName = name;
        price = 0.0;
        quantity = 0;
    }

    Product(String name, double p) {
        productName = name;
        price = p;
        quantity = 0;
    }

    Product(String name, double p, int q) {
        productName = name;
        price = p;
        quantity = q;
    }

    double calculateTotalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs. " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: Rs. " + calculateTotalCost());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Mobile", 15000);
        Product p4 = new Product("Keyboard", 1200, 3);

        System.out.println("Product 1 (No Arguments):");
        p1.display();

        System.out.println("Product 2 (Name Only):");
        p2.display();

        System.out.println("Product 3 (Name and Price):");
        p3.display();

        System.out.println("Product 4 (All Fields):");
        p4.display();
    }
}
