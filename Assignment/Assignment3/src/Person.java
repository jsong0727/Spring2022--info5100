public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getNotification(SeattlePoliceDepartment spd) {
        System.out.println("**************");

        System.out.println("Person get notification: " + this.getName());
        System.out.println("Message: " + spd.notification);
    }

    public void subscribe(SeattlePoliceDepartment spd) {
        if (!spd.persons.contains(this)) {
            spd.persons.add(this);
        }
    }

    public void unsubscribe(SeattlePoliceDepartment spd) {
        if (!spd.persons.contains(this)) {
            spd.persons.remove(this);
        }
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
