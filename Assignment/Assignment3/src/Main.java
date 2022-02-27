public class Main {
    public static void main(String[] args) {
        SeattlePoliceDepartment spd = new SeattlePoliceDepartment();

        Person person1 = new Person("Person 1", 12);
        Person person2 = new Person("Person 2", 15);
        Person person3 = new Person("Person 3", 28);
        Person person4 = new Person("Person 4", 33);

        person1.subscribe(spd);
        person2.subscribe(spd);
        person3.subscribe(spd);
        person4.subscribe(spd);

        spd.notifyCitizen("Hello, Citizens");

        person1.unsubscribe(spd);
        person2.unsubscribe(spd);

        spd.notifyCitizen("How are your?");


    }
}
