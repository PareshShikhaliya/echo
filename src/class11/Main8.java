package class11;

public class Main8 {
    public static void main(String[] args) {
        // Create a school with a maximum capacity of 3 students
        School school = new School("MySchool", 3);

        // Create some student objects
        Student student1 = new Student("Alice", 15, "9th");
        Student student2 = new Student("Bob", 14, "8th");
        Student student3 = new Student("Charlie", 16, "10th");


        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Display the students in the school
        school.displayStudents();

//        // Add more students
//        Student student4 = new Student("David", 13, "7th");
//        school.addStudent(student4);
//
//        Student student5 = new Student("Emma", 15, "9th");
//        school.addStudent(student5);
//
//        // Try to add another student (school is already full)
//        Student student6 = new Student("Frank", 17, "11th");
//        school.addStudent(student6);
//
//        // Display the updated list of students in the school
//        school.displayStudents();
//
//        // Print the total number of students in the school
//        System.out.println("Total students in the school: " + school.getNumStudents());
    }
}

class Student {
    private static int totalStudents = 0;
    private String name;
    private int age;
    private String grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age, String grade)

    {
        this.name = name;
        this.age = age;
        this.grade = grade;
        totalStudents++;
    }

    public Student(String name, String grade)
    {
        this.name = name;
        this.age = age;
        this.grade = grade;
        totalStudents++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}

class School
{
    private String name;
    int[] num = new int[10];
    private Student[] students = new Student[10];
    private int numStudents;

    public School(String name, int maxCapacity)
    {
        this.name = name;
        students = new Student[maxCapacity];
        numStudents = 0;
    }

    public void addStudent(Student student) {
        if (numStudents < students.length) {
            students[numStudents] = student;
            numStudents++;
        } else {
            System.out.println("School is full. Cannot add more students.");
        }
    }

    public void displayStudents() {
        System.out.println("Students in " + name + " School:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + ". " + students[i].getName() + " (Age: " + students[i].getAge() +
                    ", Grade: " + students[i].getGrade() + ")");
        }
    }

    public int getNumStudents() {
        return numStudents;
    }
}
