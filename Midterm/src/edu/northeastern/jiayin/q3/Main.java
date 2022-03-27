package edu.northeastern.jiayin.q3;

public class Main {
    public static void main(String[] args) {
        Psychiatrist psychiatrist = new Psychiatrist();
        Moody sad = new Sad();
        psychiatrist.examine(sad);
        Moody happy = new Happy();
        psychiatrist.examine(happy);
    }


}

