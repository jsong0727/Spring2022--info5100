package Question1;

public class Student {
    private int rollNumber;
    private String name;

    public Student() {
    }

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student(Student student) {
        Student sdt = new Student();
        this.rollNumber = student.rollNumber;
        this.name = student.name;


    }

    public int printRoll() {
        return rollNumber;
    }

    public String printName() {
        return name;
    }
}
