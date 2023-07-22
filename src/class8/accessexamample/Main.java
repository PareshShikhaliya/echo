package class8.accessexamample;

public class Main {

    public static void main(String[] args) {
        // Create a new Student object using the constructor
        Student student = new Student("John Doe", 20, "12345");

        // Access and print the student details using getter methods
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student Roll Number: " + student.getRollNumber());

        // Use setter methods to modify student details
        student.setName("Jane Smith");
        student.setAge(21);
        student.setRollNumber("67890");

        // Print the updated student details
        System.out.println("\nUpdated Student Details:");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student Roll Number: " + student.getRollNumber());

         System.out.println("AGE is  " + student.age); // make it public
        System.out.println("AGE is  " + student.age); // make it private
    }
}

