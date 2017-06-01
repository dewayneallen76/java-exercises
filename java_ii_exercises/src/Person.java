/**
 * Created by dewayneallen on 6/1/17.
 */
public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello "+ this.name);
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Dewayne");
        Person person2 = new Person("Kristy");
        person1.sayHello();
        person2.sayHello();

    }
}
