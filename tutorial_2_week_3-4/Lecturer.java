
class Lecturer extends Person {

    public Lecturer(String name, String id) {
        super(name, id);
    }

    @Override
    void introduce() {
        System.out.println("I am a lecturer.");
    }
}
