
class Student extends Person {

    public Student(String name, String id) {
        super(name, id);
    }

    @Override
    void introduce() {
        System.out.println("I am a student.");
    }
}
