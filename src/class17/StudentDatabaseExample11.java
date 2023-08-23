package class17;

import java.util.HashMap;
import java.util.Map;

class Student  implements Comparable<Student>
{
    private int studentId;
    private String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(studentId);
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student otherStudent = (Student) obj;
        return studentId == otherStudent.studentId && name.equals(otherStudent.name);
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.studentId, otherStudent.studentId);
    }

}

public class StudentDatabaseExample11 {
    public static void main(String[] args) {
        //Map<Student, String> studentDatabase = new HashMap<>();
        Map<Student, String> studentDatabase = new HashMap<>();

        Student alice = new Student(101, "Alice");

        Student aliceDuplicate = new Student(102, "Alice"); // Duplicate studentId and name

        studentDatabase.put(alice, "Computer Science");
        studentDatabase.put(aliceDuplicate, "Computer Science");

        System.out.println("size "+studentDatabase.size());

        // Retrieving course using custom class keys
        String aliceCourse = studentDatabase.get(alice);
        String aliceDuplicateCourse = studentDatabase.get(aliceDuplicate);

        System.out.println("Alice's Course: " + aliceCourse);
        System.out.println("Alice Duplicate's Course: " + aliceDuplicateCourse);
    }
}
