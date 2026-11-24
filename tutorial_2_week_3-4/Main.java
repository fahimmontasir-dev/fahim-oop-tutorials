
public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Fahim", "001");
        Person p2 = new Student("Fahim", "002");
        Person p3 = new Lecturer("Fahim", "003");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}
