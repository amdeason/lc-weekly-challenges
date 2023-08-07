
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

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

    public void compareAge(Person p1, Person p2) {
        if (p1.getAge() > p2.getAge()) {
            System.out.println(p2.getName() + " is younger than " + p1.getName());
        }
        else if (p1.getAge() < p2.getAge()) {
            System.out.println(p2.getName() + " is older than " + p1.getName());
        }
        else {
            System.out.println(p2.getName() + " is the same age as " + p1.getName());
        }
    }
}