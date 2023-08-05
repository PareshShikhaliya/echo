package class12;

import java.util.Objects;

class Student2 {
    private int id;
    private String name;
    private int age;

    public Student2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters and setters (not shown for brevity)

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return id == student2.id &&
                age == student2.age &&
                Objects.equals(name, student2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class HashCodeExampleWithOverride4 {
    public static void main(String[] args) {
        Student2 student21 = new Student2(1, "John Doe", 20);
        Student2 student2 = new Student2(1, "John Doe", 20); // Duplicate of student1

        System.out.println("Hash Code for student1: " + student21.hashCode());
        System.out.println("Hash Code for student2: " + student2.hashCode());

        // Check equality using equals()
        System.out.println("student1 equals student2: " + student21.equals(student2));
    }
}
