package Lesson6;

public class Student {
    private String name;
    private double gpa;

    public Student(){
        name = "Paul";
        gpa = 3.5;
    }

    public Student(String n){
        name = n;
        gpa = 3.5;
    }

    public Student(String n, double g){
        name = n;
        gpa = g;
    }

    public String getName(){
        return name;
    }
    public double setGpa() { return gpa; }
}
