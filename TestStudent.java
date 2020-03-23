package Lesson6;

public class TestStudent {
    public static void main(String[] args) {
        Student e1 = new Student("John", 5.2);
        System.out.println("Name: " + e1.getName());
        System.out.println("Gpa: " +e1.setGpa());

        Student e2 = new Student("John");
        System.out.println("Name: " + e2.getName());
        System.out.println("Gpa: " + e2.setGpa());

        Student e3 = new Student();
        System.out.println("Name: " + e3.getName());
        System.out.println("Gpa: " + e3.setGpa());
    }
}
