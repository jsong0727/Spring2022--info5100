package edu.northeastern.jiayin.q3;

public class Happy extends Moody {

    //returns string indicating happy
    @Override
    public String getMood() {
        return "Happy";
    }


    //print laughter string “heeehee....hahahah...HAHAHA!!”
    public void expressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }


    //returns message about self: “Subject laughs a lot”
    public String toString() {
        return "Subject laughs a lot";
    }

}
