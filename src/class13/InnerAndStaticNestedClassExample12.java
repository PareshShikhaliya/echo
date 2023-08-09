package class13;

/*
Rules:

Access to Enclosing Members:

Inner classes can access both static and instance members of the enclosing class.
Static nested classes can only access static members of the enclosing class.

Instance Creation:

To create an instance of an inner class, you generally need an instance of the enclosing class.
Static nested classes can be created using the syntax Outer.Nested, without an instance of the outer class.
Scope:

The scope of an inner class is limited to the enclosing class.
The scope of a static nested class is not restricted by the enclosing class.
Visibility:

Inner classes have access to private members of the enclosing class.
Static nested classes can only access private members if they are declared in the same class.
Static Members:

Inner classes cannot have static members.
Static nested classes can have static members.
Both inner classes and static nested classes can be useful in different scenarios based on your design and encapsulation needs.
 */

class Outer {
    private int outerVar = 10;
    private static int outerStaticVar = 20;

    // Inner class
    class Inner {
        void display() {
            System.out.println("Inner class accessing outerVar: " + outerVar);
        }
    }

    // Static nested class
    static class Nested {
        void display() {
            System.out.println("Static Nested class accessing outerStaticVar: " + outerStaticVar);
        }
    }
}

public class InnerAndStaticNestedClassExample12 {
    public static void main(String[] args) {
        // Creating an instance of Inner class
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();

        // Creating an instance of Static Nested class
        Outer.Nested nested = new Outer.Nested();
        nested.display();
    }
}
