package edu.northeastern.jiayin.q3;

public class Psychiatrist {
    //asks moody object about its mood
    public void examine(Moody mood) {
        System.out.println("How are you feeling today?");
        mood.queryMood();
        mood.expressFeelings();
        observe(mood);

    }


    //a moodyObject is observed to either laugh or cry
    public void observe(Moody mood) {
        System.out.println("Observation: " + mood.toString());
    }


}
