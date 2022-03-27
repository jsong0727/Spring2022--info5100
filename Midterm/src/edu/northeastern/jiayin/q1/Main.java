package edu.northeastern.jiayin.q1;

public class Main {
    public static void main(String[] args) {
        Student sample = new Student();
        Student jiayin = new Student(sample);
        jiayin.setName("Jiayin");
        jiayin.setStudentID(202201);
        jiayin.setGpa(4.0);
        sample.printStudentInfo();
        jiayin.printStudentInfo();
    }
}
