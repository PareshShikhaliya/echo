package class13;

class Parent {
    static void staticMethod() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    static void staticMethod() {
        System.out.println("Static method in Child class");
    }
}

public class MethodHidingExample11 {
    public static void main(String[] args) {
        // Calling static methods using class names
        Parent.staticMethod(); // Calls Parent's staticMethod
        Child.staticMethod();  // Calls Child's staticMethod
        ///Child.staticMethod(); rename static method to show how it hide
    }
}
