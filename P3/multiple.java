//Multiple inheritance through classes means a child class inherits from two or more parent classes. Java does not allow this
//Example
class A {
    void show() { }
}

class B {
    void show() { }
}

// Invalid Java syntax
class C extends A, B {
}
