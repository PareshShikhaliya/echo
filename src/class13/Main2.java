package class13;

class Student {
    private static int totalStudents = 0; // Total students in a school
    private String name;

    public Student(String name) {
        this.name = name;
        totalStudents++; // Increase total students when a new student is created
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
    }

    public static void displayTotalStudents() {

        System.out.println("Total Students: " + totalStudents);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student.displayTotalStudents(); // Total Students: 1

        Student student2 = new Student("Bob");
        Student.displayTotalStudents(); // Total Students: 2

        Student student3 = new Student("Carol");
        Student.displayTotalStudents(); // Total Students: 3

        student1.displayTotalStudents(); // Student Name: Alice
        student2.displayTotalStudents(); // Student Name: Bob
        student3.displayTotalStudents(); // Student Name: Carol
    }
}
