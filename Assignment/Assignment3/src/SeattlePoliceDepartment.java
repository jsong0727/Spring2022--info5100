import java.util.ArrayList;

public class SeattlePoliceDepartment {
    ArrayList<Person> persons;
    String notification;

    public SeattlePoliceDepartment() {
        this.persons = new ArrayList<>();
    }

    public void notifyCitizen(String notification) {
        this.notification = notification;
        for (Person person : persons) {
            person.getNotification(this); // new
//            person.subscribe(this);
        }
    }
}
