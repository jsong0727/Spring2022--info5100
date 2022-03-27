package edu.northeastern.jiayin.q1;

public class Student {
    private String name;
    private int studentID;
    private double gpa;

    public Student() {
        name = "Sample Student";
        studentID = 0;
        gpa = 0.0;
    }

    //copy constructor
    public Student(Student student) {
        Student sdt = new Student();
        this.name = student.name;
        this.studentID = student.studentID;
        this.gpa = student.gpa;
    }

    //
    public Student(String name, int studentID, double gpa) {
        this.name = name;
        this.studentID = studentID;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void printStudentInfo() {
        System.out.println("==============");
        System.out.println("Name = " + this.name);
        System.out.println("StudentID: " + this.studentID);
        System.out.println("GPA = " + this.gpa);
    }
}
