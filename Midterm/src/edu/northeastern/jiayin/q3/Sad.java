package edu.northeastern.jiayin.q3;

public class Sad extends Moody {
    //returns string indicating sad
    @Override

    public String getMood() {
        return "Sad";
    }

    //print crying string “‘waah’ ‘boo hoo’ ‘weep’ ‘sob’”
    @Override
    public void expressFeelings() {
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob’");
    }

    //returns message about self : “Subject cries a lot”
    public String toString() {
        return "Subject cries a lot";
    }

    ;


}
