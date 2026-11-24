
public class StudentGrade {
    public static void main(String[] args) {

        String studentName = "Fahim";
        int studentAge = 22;
        double marks = 85.5;

        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Marks: " + marks);

        if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}
