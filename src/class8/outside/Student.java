package class8.outside;

 public class Student
 {
     public String name;
    public int age;
    public String rollNumber;

     public static String schoolName = "CodeGym";

    // Constructor with parameters
    public Student(String name, int age, String rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

     public Student(String name, int age) {
         this.name = name;
         this.age = age;
     }

     public Student() {

     }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method for rollNumber
    public String getRollNumber() {
        return rollNumber;
    }

    // Setter method for rollNumber
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

}
