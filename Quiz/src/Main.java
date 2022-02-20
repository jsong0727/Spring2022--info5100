public class Main {
    public static void main(String[] args) {
        Professor p = new Professor("Ashish", 1, 30);
        Student s = new Student("Jiayin", 2, 18);

        p.giveQuiz("What is 1+1?");
        s.takeQuiz("2");

    }
}
